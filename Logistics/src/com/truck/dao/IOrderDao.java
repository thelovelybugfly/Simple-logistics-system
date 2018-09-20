package com.truck.dao;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.truck.bean.OrderBean;

/**
 * 订单接口
 * @author mengjie
 *
 */
public interface IOrderDao {
	/**
	 * 通过用户的id和订单状态（status）查询订单信息
	 */
	public List<OrderBean> selectOrderByUidAndStatus(@Param(value="status") Integer status,@Param(value="u_id") Integer u_id );
	/**
	 * 通过订单Id更新订单的状态
	 * 状态1：正在运输的订单 状态0：已完成订单
	 */
	@Update("Update t_order set o_status=#{status} where o_id=#{id}")
	public void updateByStatus(@Param(value="id")int id,@Param(value="status")int status);
	/**
	 * @return 
	 * 
	 */
	public List<OrderBean> selectOrderByUidAndStatusAndUser(@Param(value="u_id") Integer u_id);
	/**
	 * 通过id查找订单
	 * @param id
	 * @return
	 */
	@Select("select * from t_order where id=#{id}")
	public List<OrderBean> findById(@Param(value="id")int id);
	/**
	 * 通过用户名查找订单
	 * @param name
	 * @return
	 */
	@Select("select * from t_order where name=#{name}")
	public OrderBean findUserName(@Param(value="name")String  name);
	/**
	 * 查询所有订单
	 * @return
	 */
	@Select("select * from t_order ")
	public OrderBean findAll();
	 /**
	 * 增加订单
	 * @param id
	 * @return
	 * @author lsl
	 */
	@Insert("insert into t_order(o_r_id,o_u_id,o_ordernumber) values(#{bean.userRequirementBean.id},#{bean.driverBean.id},#{bean.orderNumber})")
	public void addOrder(@Param(value = "bean") OrderBean bean);
	
	
	
}
