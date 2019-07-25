package com.byzx.mybatis.vo;

public class OrderDetail {
	private int odid;
	private int ordersId;
	private int itemsId;
	private int itemsNum;
	public int getOdid() {
		return odid;
	}
	public void setOdid(int odid) {
		this.odid = odid;
	}
	public int getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}
	public int getItemsId() {
		return itemsId;
	}
	public void setItemsId(int itemsId) {
		this.itemsId = itemsId;
	}
	public int getItemsNum() {
		return itemsNum;
	}
	public void setItemsNum(int itemsNum) {
		this.itemsNum = itemsNum;
	}
	@Override
	public String toString() {
		return "OrderDetail [odid=" + odid + ", ordersId=" + ordersId + ", itemsId=" + itemsId + ", itemsNum="
				+ itemsNum + "]";
	}
	
}
