package com.byzx.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.byzx.mybatis.dao.OrdersMapper;
import com.byzx.mybatis.vo.Orders;


public class OrderMapperTest {
	private SqlSessionFactory ssf;
	@Before
	public void setup() throws IOException {
		InputStream is=Resources.getResourceAsStream("SqlConfig.xml");
		ssf=new SqlSessionFactoryBuilder().build(is);
	}
	
	
	@Test
	public void testfindOrder1() {
		SqlSession sqlSession=ssf.openSession();
		OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
	
		List <Orders> orderses=ordersMapper.findOrders1();
		for(Orders order:orderses) {
			System.out.println(order);

		}
		
	}
	@Test
	public void testfindOrder2() {
		SqlSession sqlSession=ssf.openSession();
		OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
	
		List <Orders> orderses=ordersMapper.findOrders2();
		for(Orders order:orderses) {
			System.out.println(order);
			
		}
		
	}
	
	@Test
	public void testfindOrdersaAndOrderDetai() {
		SqlSession sqlSession=ssf.openSession();
		OrdersMapper ordersMapper=sqlSession.getMapper(OrdersMapper.class);
	
		List <Orders> orderses=ordersMapper.findOrdersaAndOrderDetai();
		for(Orders order:orderses) {
			System.out.println(order);
			
		}
		
	}

	
}
