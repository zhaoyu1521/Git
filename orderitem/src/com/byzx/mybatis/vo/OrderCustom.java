package com.byzx.mybatis.vo;

public class OrderCustom extends Orders{
	private String username;
	private String brithday;
	private String sex;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "OrderCustom [username=" + username + ", brithday=" + brithday + ", sex=" + sex + ", address=" + address
				+ "]"+"Orders [oid=" + getOid() + ", userId=" + getUserId() + ", number=" + getNumber() + ", createtime=" + getCreatetime() + "]";
	}
	
	
}
