package com.truck.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 货车类Truck
 * 属性：主键	-->	id
 * 		载重量		-->	load
 * 		车牌号		-->	plateNumber
 * 		货车位置		-->	location
 * 		货车GPS信息	-->	gpsBean
 * 		货车类型		-->	carTypeBean
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class TruckBean {

	private Integer id;
	private Double load;
	private String plateNumber;
	private String location;
	private GPSBean gpsBean;
	
	// 一个货车对应一个货车类型
	private CarTypeBean carTypeBean;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getLoad() {
		return load;
	}
	public void setLoad(Double load) {
		this.load = load;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public GPSBean getGpsBean() {
		return gpsBean;
	}
	public void setGpsBean(GPSBean gpsBean) {
		this.gpsBean = gpsBean;
	}
	public CarTypeBean getCarTypeBean() {
		return carTypeBean;
	}
	public void setCarTypeBean(CarTypeBean carTypeBean) {
		this.carTypeBean = carTypeBean;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	
	@Override
	public String toString() {
		return "TruckBean [id=" + id + ", load=" + load + ", plateNumber="
				+ plateNumber + ", location=" + location + ", gpsBean="
				+ gpsBean + ", carTypeBean=" + carTypeBean + "]";
	}
}
