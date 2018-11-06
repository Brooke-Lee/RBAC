package com.rbac.service.impl;

import java.util.List;

import com.rbac.bean.Permission;
import com.rbac.bean.User;
import com.rbac.dao.PermissionDao;
import com.rbac.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PermissionServiceImpl implements PermissionService {

	@Autowired
	private PermissionDao permissionDao;

	@Override
	public Permission queryRootPermission() {
		return permissionDao.queryRootPermission();
	}

	@Override
	public List<Permission> queryChildPermissions(Integer pid) {
		return permissionDao.queryChildPermissions(pid);
	}

	@Override
	public List<Permission> queryAll() {
		return permissionDao.queryAll();
	}

	/**
	 * 添加
	 */
	@Override
	public void insertPermission(Permission permission) {
		permissionDao.insertPermission(permission);
	}

	/**
	 * 根据id查询
	 */
	@Override
	public Permission queryById(Integer id) {
		return permissionDao.queryById(id);
	}

	/**
	 * 修改
	 */
	@Override
	public void updatePermission(Permission permission) {
		permissionDao.updatePermission(permission);
	}

	@Override
	public void deletePermission(Permission permission) {
		permissionDao.deletePermission(permission);
	}

	@Override
	public List<Integer> queryPermissionidsByRoleid(Integer roleid) {
		return permissionDao.queryPermissionidsByRoleid(roleid);
	}

	@Override
	public List<Permission> queryPermissionsByUser(User dbUser) {
		return permissionDao.queryPermissionsByUser(dbUser);
	}

}
