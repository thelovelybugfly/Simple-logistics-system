package com.truck.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 用户投诉类
 * 属性：主键	-->	id
 * 		complaintTime	-->	投诉时间
 * 		context	-->	投诉内容
 * 		orderBean	-->	订单
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class ComplaintBean {

	private Integer id;
	private String complaintTime;
	private String context;
	private OrderBean orderBean;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getComplaintTime() {
		return complaintTime;
	}
	public void setComplaintTime(String complaintTime) {
		this.complaintTime = complaintTime;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public OrderBean getOrderBean() {
		return orderBean;
	}
	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}
	
	@Override
	public String toString() {
		return "ComplaintBean [id=" + id + ", complaintTime=" + complaintTime
				+ ", context=" + context + ", orderBean=" + orderBean + "]";
	}
}
