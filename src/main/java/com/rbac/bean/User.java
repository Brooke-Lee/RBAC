package com.rbac.bean;

/**
 * 用户实体类
 * @author Little Prince 
 * 2018年6月17日下午8:50:42
 */
public class User {
	/**用户id(主键)*/
	private Integer id;
	/**用户姓名*/
	private String username;
	/**登录账号*/
	private String loginacct;
	/**密码*/
	private String userpswd;
	/**邮箱*/
	private String email;
	/**创建时间*/
	private String createtime;

	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoginacct() {
		return loginacct;
	}
	public void setLoginacct(String loginacct) {
		this.loginacct = loginacct;
	}
	public String getUserpswd() {
		return userpswd;
	}
	public void setUserpswd(String userpswd) {
		this.userpswd = userpswd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
