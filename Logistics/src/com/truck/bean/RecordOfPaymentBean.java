package com.truck.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 用户付款记录类
 * 属性：主键	-->	id
 * 		付款方式	-->	modeOfPayment
 * 		金额	-->	sum
 * 		时间	-->	time
 * 		订单	-->	orderBean
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class RecordOfPaymentBean {

	private Integer id;
	private String modeOfPayment;
	private Double sum;
	private String time;
	private OrderBean orderBean;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public Double getSum() {
		return sum;
	}
	public void setSum(Double sum) {
		this.sum = sum;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public OrderBean getOrderBean() {
		return orderBean;
	}
	public void setOrderBean(OrderBean orderBean) {
		this.orderBean = orderBean;
	}
	
	@Override
	public String toString() {
		return "RecordOfPaymentBean [id=" + id + ", modeOfPayment="
				+ modeOfPayment + ", sum=" + sum + ", time=" + time
				+ ", orderBean=" + orderBean + "]";
	}
}
