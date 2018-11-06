package com.rbac.service;

import com.rbac.bean.Role;

import java.util.List;
import java.util.Map;


/**
 * 角色业务接口
 * @author Little Prince 李文攀
 * 2018年6月18日下午3:12:37
 */
public interface RoleService {
	List<Role> pageQueryData(Map<String, Object> map);

	int pageQueryCount(Map<String, Object> map);

	List<Role> queryAll();

	void insertRolePermission(Map<String, Object> paramMap);


}
