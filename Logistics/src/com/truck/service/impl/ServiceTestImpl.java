package com.truck.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.bean.UserBean;
import com.truck.dao.ITruckDao;
import com.truck.dao.IUserDao;
import com.truck.service.IServiceTest;
@Service("TsetService")
public class ServiceTestImpl implements IServiceTest {
	@Autowired
	public ITruckDao truckDao;
	@Autowired
	public IUserDao userDao;
	@Override
	public void myTest() {
//		TruckBean truck =new TruckBean();
//		GPSBean gps=new  GPSBean();
//		CarTypeBean carType= new CarTypeBean();
//		gps.setId(1);
//		carType.setId(1);
//		truck.setLoad(100d);
//		truck.setLocation("1");
//		truck.setPlateNumber("1");
//		truck.setCarTypeBean(carType);
//		truck.setGpsBean(gps);
//		truckDao.addTruck(truck);
//		System.out.println(truckDao.getTruckMsgByBean(truck));
		UserBean user =userDao.selectUserById(1);
		System.out.println(user);
//		user.setName("18593118618");
//		userDao.insertUser(user);
		userDao.selectUserByName("小蒋");
	
	}

}
