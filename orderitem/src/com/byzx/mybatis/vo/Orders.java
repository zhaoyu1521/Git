package com.byzx.mybatis.vo;

import java.util.Date;
import java.util.List;

public class Orders {
	private int oid;
	private int userId;
	private String number;
	private Date createtime;
	//用户信息
	private User user;
	//订单明细
	private List<OrderDetail> orderdetails;
	
	
	public List<OrderDetail> getOrderdetails() {
		return orderdetails;
	}
	public void setOrderdetails(List<OrderDetail> orderdetails) {
		this.orderdetails = orderdetails;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime + "]"+"Orders [oid=" + oid + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime + "]";
	}
	
}
