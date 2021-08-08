package com.xh.entity;

public class T_detail {
	private Integer bdId;
	private String bdName;
	private String bdPerson;
	public T_detail() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public T_detail(Integer bdId, String bdName, String bdPerson) {
		super();
		this.bdId = bdId;
		this.bdName = bdName;
		this.bdPerson = bdPerson;
	}
	@Override
	public String toString() {
		return "T_detail [bdId=" + bdId + ", bdName=" + bdName + ", bdPerson="
				+ bdPerson + "]";
	}
	public Integer getBdId() {
		return bdId;
	}
	public void setBdId(Integer bdId) {
		this.bdId = bdId;
	}
	public String getBdName() {
		return bdName;
	}
	public void setBdName(String bdName) {
		this.bdName = bdName;
	}
	public String getBdPerson() {
		return bdPerson;
	}
	public void setBdPerson(String bdPerson) {
		this.bdPerson = bdPerson;
	}

}
