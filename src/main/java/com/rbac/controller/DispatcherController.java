package com.rbac.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import com.rbac.bean.AJAXResult;
import com.rbac.bean.Permission;
import com.rbac.bean.User;
import com.rbac.service.PermissionService;
import com.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 调度控制器
 * @author Little Prince 
 * 2018年6月18日下午5:18:57
 */
@Controller
public class DispatcherController {

	@Autowired
	private UserService userService;

	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	/**
	 * 转发到错误页面
	 * @return
	 */
	@RequestMapping("/error")
	public String error() {
		return "error";
	}
	
	/**
	 * 退出时重定向到登录页面，并清除会话信息。
	 * @param session
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		//登出时设置会话失效
		session.invalidate();
		return "redirect:login";
	}
	
	
	/**
	 * 转发到首页
	 * @return
	 */
	@RequestMapping("/main")
	public String main() {
		return "main";
	}
	
	
	/**
	 * 异步登录
	 * @param user:将页面传递的参数封装为用户实体
	 * @param session:封装用户会话信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/doAJAXLogin")
	public Object doAJAXLogin(User user, HttpSession session) {
		//创建异步请求的结果对象
		AJAXResult result = new AJAXResult();
		User dbUser = userService.query4Login(user);
		if ( dbUser != null ) {
			session.setAttribute("loginUser", dbUser);
			
			//获取用户权限信息
			List<Permission> permissions = permissionService.queryPermissionsByUser(dbUser);
			Map<Integer, Permission> permissionMap = new HashMap<Integer, Permission>();
			Permission root = null;
			Set<String> uriSet = new HashSet<String>();
			for ( Permission permission : permissions ) {
				permissionMap.put(permission.getId(), permission);
				if ( permission.getUrl() != null && !"".equals(permission.getUrl()) ) {
					uriSet.add(session.getServletContext().getContextPath() + permission.getUrl());
				}
			}
			session.setAttribute("authUriSet", uriSet);
			for ( Permission permission : permissions ) {
				Permission child = permission;
				if ( child.getPid() == 0 ) {
					root = permission;
				} else {
					Permission parent = permissionMap.get(child.getPid());
					parent.getChildren().add(child);
				}
			}
			session.setAttribute("rootPermission", root);
			
			result.setSuccess(true);
		} else {
			result.setSuccess(false);
		}
		
		return result;
	}
	
}
