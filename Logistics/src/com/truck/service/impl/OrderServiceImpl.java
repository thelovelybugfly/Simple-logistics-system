package com.truck.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.bean.OrderBean;
import com.truck.dao.IOrderDao;
import com.truck.service.IOrderService;

@Service("orderService")
public class OrderServiceImpl implements IOrderService{
	
	@Autowired
	private IOrderDao orderDao;
	/**
	 * 根据用户id和订单状态查询订单信息
	 */
	@Override
	public List<OrderBean> findOrderByStatusAndUid(Integer status, Integer u_id) {
		List<OrderBean> list = new ArrayList<OrderBean>();
		list= orderDao.selectOrderByUidAndStatus(status, u_id);
	//	System.out.println(bean);
		return list;
	}
	/**
	 * 根据订单ID改变订单状态，然后根据订单状态和用户查询订单信息
	 */
	@Override
	public List<OrderBean> changeOrder(Integer id,Integer status, Integer u_id) {
		List<OrderBean> list = new ArrayList<OrderBean>();
		orderDao.updateByStatus(id,status-1);
		list = orderDao.selectOrderByUidAndStatus(status, u_id);
		return list;
	}
	@Override
	public List<OrderBean> findOrderByStatusAndUidAndUser(Integer status,Integer u_id) {
		List<OrderBean> list = new ArrayList<OrderBean>();
		if(status>0){
			list= orderDao.selectOrderByUidAndStatusAndUser(u_id);
		}else {
			list= orderDao.selectOrderByUidAndStatus(status, u_id);
		}
	//	System.out.println(bean);
		return list;
	}
	
	
}
