package com.truck.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.bean.OrderBean;
import com.truck.bean.UserBean;
import com.truck.bean.UserRequirementBean;
import com.truck.dao.IOrderDao;
import com.truck.dao.IUserRequirementDao;
import com.truck.service.IDriverService;

@Service("driverService")
public class DriverServiceImpl implements IDriverService {

	@Autowired
	IUserRequirementDao userRequirementDao;
	@Autowired
	IOrderDao orderDao;

	@Override
	public List<UserRequirementBean> getLimittedUserRequirementBean(
			UserRequirementBean bean, int a) {
		if (bean.getOrigin().equals("")) {
			bean.setOrigin(null);
		}
		if (bean.getDestination().equals("")) {
			bean.setDestination(null);
		}
		if (bean.getDepartureTime().equals("")) {
			bean.setDepartureTime(null);
		}
		a = (a - 1) * 9;
		int b = a + 9;
		List<UserRequirementBean> list = userRequirementDao.getALLOfOnePage(
				bean, a, b);
		System.out.println(list);
		return list;
	}

	@Override
	public int getTotalPage(UserRequirementBean bean) {
		List<UserRequirementBean> list = userRequirementDao.getALL(bean);
		int page = (int) Math.ceil(list.size() / 9.0);
		return page;
	}

	@Override
	public boolean generateOrder(int id, UserBean driverBean) {
		if (driverBean == null) {
			driverBean = new UserBean();
			driverBean.setId(1);
		}
		// 根据用户需求id查询该条需求
		UserRequirementBean uBean = userRequirementDao.selectByPrimaryKey(id);
		// 生成订单编号
		LocalDateTime time = LocalDateTime.now();
		String aString = "" + time.getYear() + time.getMonthValue() + time.getDayOfMonth() + time.getHour() + time.getMinute() + time.getSecond() + driverBean.getId();
		// 获得订单实体，传入OrderDao进行插入
		OrderBean oBean = new OrderBean();
		oBean.setDriverBean(driverBean);
		oBean.setOrderNumber(aString);
		oBean.setUserRequirementBean(uBean);
		orderDao.addOrder(oBean);
		return false;
	}

}
