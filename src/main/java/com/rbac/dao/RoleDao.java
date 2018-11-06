package com.rbac.dao;

import java.util.List;
import java.util.Map;

import com.rbac.bean.Role;
import org.apache.ibatis.annotations.Select;


/**
 * 角色dao接口
 * @author Little Prince 李文攀
 * 2018年6月18日下午3:15:06
 */
public interface RoleDao {

	List<Role> pageQueryData(Map<String, Object> map);

	int pageQueryCount(Map<String, Object> map);

	@Select("select * from t_role")
	List<Role> queryAll();

	void insertRolePermission(Map<String, Object> paramMap);

	void deleteRolePermissions(Map<String, Object> paramMap);

}
