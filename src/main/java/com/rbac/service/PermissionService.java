package com.rbac.service;

import com.rbac.bean.Permission;
import com.rbac.bean.User;

import java.util.List;


/**
 * 权限业务接口
 * @author Little Prince 李文攀
 * 2018年6月18日下午3:12:56
 */
public interface PermissionService {

	Permission queryRootPermission();

	List<Permission> queryChildPermissions(Integer pid);

	List<Permission> queryAll();

	void insertPermission(Permission permission);

	Permission queryById(Integer id);

	void updatePermission(Permission permission);

	void deletePermission(Permission permission);

	List<Integer> queryPermissionidsByRoleid(Integer roleid);

	List<Permission> queryPermissionsByUser(User dbUser);

}
