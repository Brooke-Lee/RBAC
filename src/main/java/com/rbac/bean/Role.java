package com.rbac.bean;

/**
 * 角色实体类
 * @author Little Prince
 * 2018年6月18日上午5:41:01
 */
public class Role {
	
	/**角色id*/
	private Integer id;
	/**角色名称*/
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
