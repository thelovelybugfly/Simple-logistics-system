package com.truck.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 货车类型类
 * 属性：主键			-->	id
 * 		起步距离		-->	basicDistance
 * 		起步价		-->	basicPrice
 * 		超里程单价	-->	superPrice
 * @author Administrator
 *
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class CarTypeBean {

	private Integer id;
	private Integer basicDistance;
	private Double basicPrice;
	private Double superPrice;
	
	// 一个货车类型对应多个货车
	private List<TruckBean> truckBeans;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBasicDistance() {
		return basicDistance;
	}
	public void setBasicDistance(Integer basicDistance) {
		this.basicDistance = basicDistance;
	}
	public Double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(Double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public Double getSuperPrice() {
		return superPrice;
	}
	public void setSuperPrice(Double superPrice) {
		this.superPrice = superPrice;
	}
	public List<TruckBean> getTruckBeans() {
		return truckBeans;
	}
	public void setTruckBeans(List<TruckBean> truckBeans) {
		this.truckBeans = truckBeans;
	}
	
	@Override
	public String toString() {
		return "CarTypeBean [id=" + id + ", basicDistance=" + basicDistance
				+ ", basicPrice=" + basicPrice + ", superPrice=" + superPrice
				+ ", truckBeans=" + truckBeans + "]";
	}
}
