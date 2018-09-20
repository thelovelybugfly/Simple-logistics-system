
package com.truck.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.truck.bean.OrderBean;
import com.truck.service.IOrderService;

@Controller
public class OrderController {
	@Autowired
	private IOrderService orderService;
	
	/**
	 * 查询正在进行的订单
	 * @param orderBean
	 * @return
	 */

	@RequestMapping("/orderByDriver.action")
	@ResponseBody
	public Map<String,Object> orderByDriver(@RequestBody OrderBean orderBean){
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		List<OrderBean> list = orderService.findOrderByStatusAndUid(orderBean.getStatus(), 1);
		map.put("list", list);
		System.out.println(list);
		
		return map;
	}
	/**
	 * 更新订单的状态（将进行中的订单更新为已经完成）
	 * @param orderBean
	 * @return
	 */
	@RequestMapping("/orderChange.action")
//	@ResponseBody
	public @ResponseBody Map<String,Object> orderChange(@RequestBody OrderBean orderBean){
		Map<String,Object> map = new HashMap<String,Object>();
		List<OrderBean> list = orderService.changeOrder(orderBean.getId(),orderBean.getStatus(), 1);
		map.put("list", list);
		System.out.println(list);
		return map;
	}
	
	/**
	 *查询用户正在进行的订单 
	 */
	@RequestMapping("orderByUser.action")
	@ResponseBody
	public Map<String,Object> orderByUser(@RequestBody OrderBean orderBean){
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		List<OrderBean> list = orderService.findOrderByStatusAndUidAndUser(orderBean.getStatus(),1);
		map.put("list", list);
		System.out.println(list);
		
		return map;
	} 
}
