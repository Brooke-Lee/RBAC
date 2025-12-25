package com.rbac.bean;

/**
 * ajax请求的结果对象
 * @author Little Prince 
 * 2018年6月18日下午2:58:32
 */
public class AJAXResult {

	private boolean success;
	private Object data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
	
	
	
}
