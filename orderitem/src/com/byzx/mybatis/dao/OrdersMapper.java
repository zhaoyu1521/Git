package com.byzx.mybatis.dao;

import java.util.List;

import com.byzx.mybatis.vo.Orders;

public interface OrdersMapper {
	
	
	public List<Orders> findOrders1();
	
	public List<Orders> findOrders2();
	 
	//查询订单（关联用户）及订单明细
	public List<Orders> findOrdersaAndOrderDetai();
	
	
	
	
	
}
