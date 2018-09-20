package com.truck.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * GPS信息表
 * 属性：主键			-->	id
 * 		GPS编号		-->	number
 * 		经度			-->	longitude
 * 		纬度			-->	dimension
 * @author Administrator
 *
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class GPSBean {

	private Integer id;
	private String number;
	private Double longitude;
	private Double dimension;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getDimension() {
		return dimension;
	}
	public void setDimension(Double dimension) {
		this.dimension = dimension;
	}
	
	@Override
	public String toString() {
		return "GPSBean [id=" + id + ", number=" + number + ", longitude="
				+ longitude + ", dimension=" + dimension + "]";
	}
}
