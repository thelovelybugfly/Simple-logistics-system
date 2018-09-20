package com.truck.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 订单类 属性：主键 --> id 用户需求信息 --> userRequirementBean 司机 --> driverBean 订单编号 -->
 * orderNumber 订单状态 --> state
 * 
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class OrderBean {

	private Integer id;
	
	private UserRequirementBean userRequirementBean;
	private UserBean driverBean;
	private String orderNumber;
	private Integer status;
	private String time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserRequirementBean getUserRequirementBean() {
		return userRequirementBean;
	}

	public void setUserRequirementBean(UserRequirementBean userRequirementBean) {
		this.userRequirementBean = userRequirementBean;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public UserBean getDriverBean() {
		return driverBean;
	}

	public void setDriverBean(UserBean driverBean) {
		this.driverBean = driverBean;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "OrderBean [id=" + id + ", userRequirementBean="
				+ userRequirementBean + ", driverBean=" + driverBean
				+ ", orderNumber=" + orderNumber + ", status=" + status
				+ ", time=" + time + "]";
	}




}
