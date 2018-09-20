package com.truck.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 用户需求类UserRequirement 
 * 属性：主键		 	--> id 
 * 		始发地 	 	--> origin 
 * 		目的地	 	--> destination 
 * 		出发时间		--> departureTime 
 * 		运输费用 	 	--> cost
 * 		用户 			--> userBean
 * 		货车类型		-->	carTypeBean	 
 * 		货物清单集合	--> manifestBeans
 * 
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class UserRequirementBean {

	private Integer id;
	private String origin;
	private String destination;
	private String departureTime;
	private Double cost;
	
	// 一个需求对应一个用户
	private UserBean userBean;
	
	// 一个需求对应一个货车类型
	private CarTypeBean carTypeBean;
	
	// 一个需求中有多个货物清单
	private List<ManifestBean> manifestBeans;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}
	
	public CarTypeBean getCarTypeBean() {
		return carTypeBean;
	}

	public void setCarTypeBean(CarTypeBean carTypeBean) {
		this.carTypeBean = carTypeBean;
	}

	public List<ManifestBean> getManifestBeans() {
		return manifestBeans;
	}

	public void setManifestBeans(List<ManifestBean> manifestBeans) {
		this.manifestBeans = manifestBeans;
	}

	@Override
	public String toString() {
		return "UserRequirementBean [id=" + id + ", origin=" + origin
				+ ", destination=" + destination + ", departureTime="
				+ departureTime + ", cost=" + cost + ", userBean=" + userBean
				+ ", carTypeBean=" + carTypeBean + ", manifestBeans="
				+ manifestBeans + "]";
	}
}
