package com.rbac.bean;

import java.util.List;

/**
 * 分页对象
 * @author Little Prince 
 * 2018年6月18日上午7:02:17
 */
public class Page<T> {

	private List<T> datas;
	private int pageno;
	private int totalno;
	private int totalsize;
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public int getTotalno() {
		return totalno;
	}
	public void setTotalno(int totalno) {
		this.totalno = totalno;
	}
	public int getTotalsize() {
		return totalsize;
	}
	public void setTotalsize(int totalsize) {
		this.totalsize = totalsize;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Page [datas=").append(datas).append(", pageno=").append(pageno).append(", totalno=")
				.append(totalno).append(", totalsize=").append(totalsize).append("]");
		return builder.toString();
	}
	
	
}
