package com.truck.service;

import java.util.List;

import com.truck.bean.OrderBean;

public interface IOrderService {
	/**
	 * 传入订单状态和用户，返回订单详细信息
	 */
	public List<OrderBean> findOrderByStatusAndUid(Integer status,Integer u_id);
	/**
	 * 传入订单信息，根据订单id,修改订单状态并返回新的订单信息
	 */
	public List<OrderBean> changeOrder(Integer id,Integer status, Integer u_id);
	/**
	 * 查询用户的订单
	 * @param status
	 * @param i
	 * @return
	 */
	public List<OrderBean> findOrderByStatusAndUidAndUser(Integer status,Integer u_id);
}
