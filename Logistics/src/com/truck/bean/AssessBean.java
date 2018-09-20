package com.truck.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 评价类
 * 属性：主键	-->	id
 * 		评价时间	-->	commentTime
 * 		用户评价	-->	UserContext
 * 		司机评价	-->	DriverContext
 * 		订单	-->	orderBean
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class AssessBean {

	private Integer id;
	private String commentTime;
	private String UserContext;
	private String DriverContext;
	private OrderBean orderBean;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public String getUserContext() {
		return UserContext;
	}
	public void setUserContext(String userContext) {
		UserContext = userContext;
	}
	public String getDriverContext() {
		return DriverContext;
	}
	public void setDriverContext(String driverContext) {
		DriverContext = driverContext;
	}
	public OrderBean getOrderBean() {
		return orderBean;
	}
	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}
	
	@Override
	public String toString() {
		return "AssessBean [id=" + id + ", commentTime=" + commentTime
				+ ", UserContext=" + UserContext + ", DriverContext="
				+ DriverContext + ", orderBean=" + orderBean + "]";
	}
}
