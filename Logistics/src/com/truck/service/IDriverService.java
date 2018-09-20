package com.truck.service;

import java.util.List;

import com.truck.bean.UserBean;
import com.truck.bean.UserRequirementBean;

/**
 * 司机service接口
 * @author Administrator
 */
public interface IDriverService {

	/**
	 * 司机查询所有的需求
	 * @author lsl
	 * @return
	 */
	List<UserRequirementBean> getLimittedUserRequirementBean(UserRequirementBean bean,int a);
	
	/**
	 * 获得满足条件的需求的总页数
	 * @param bean
	 * @return
	 * 
	 * @author lsl
	 */
	int getTotalPage(UserRequirementBean bean);

	/**
	 * 根据用户需求id以及session中存放的当前登录司机bean，生成订单
	 * @param id 用户需求id
	 * @param bean 司机对象
	 * @return
	 * 
	 * @author lsl
	 */
	boolean generateOrder(int id, UserBean bean);
}
