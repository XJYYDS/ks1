package com.xh.entity;

public class T_business {
	private Integer bId;
	private String bNum;
	private String bType;
	private String bMark;
	public T_business(String bNum, String bType, String bMark) {
		super();
		this.bNum = bNum;
		this.bType = bType;
		this.bMark = bMark;
	}
	public T_business() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public T_business(Integer bId, String bNum, String bType, String bMark) {
		super();
		this.bId = bId;
		this.bNum = bNum;
		this.bType = bType;
		this.bMark = bMark;
	}
	@Override
	public String toString() {
		return "T_business [bId=" + bId + ", bNum=" + bNum + ", bType=" + bType
				+ ", bMark=" + bMark + "]";
	}
	public Integer getbId() {
		return bId;
	}
	public void setbId(Integer bId) {
		this.bId = bId;
	}
	public String getbNum() {
		return bNum;
	}
	public void setbNum(String bNum) {
		this.bNum = bNum;
	}
	public String getbType() {
		return bType;
	}
	public void setbType(String bType) {
		this.bType = bType;
	}
	public String getbMark() {
		return bMark;
	}
	public void setbMark(String bMark) {
		this.bMark = bMark;
	}

}
