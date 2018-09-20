package com.truck.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 司机认证信息类
 * 属性：主键	-->	id
 * 		编号	--> number
 * 		身份证正面照片	-->	idCardFront
 * 		身份证背面照片	-->	idCardBack
 * 		驾驶证正面照片	-->	licenseFront
 * 		驾驶证背面照片	-->	licenseBack
 * 		行驶证正面照片	-->	driveringFront
 * 		行驶证背面照片	-->	driveringBack
 *		待认证的司机		-->	driverBean
 * 		待认证的货车		-->	truckBean
 * 		认证状态			-->	state
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class CredentialsBean {

	private Integer id;
	private Integer number;
	private String idCardFront;
	private String idCardBack;
	private String licenseFront;
	private String licenseBack;
	private String driveringFront;
	private String driveringBack;
	private UserBean driverBean;
	private TruckBean truckBean;
	private Integer state;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getIdCardFront() {
		return idCardFront;
	}

	public void setIdCardFront(String idCardFront) {
		this.idCardFront = idCardFront;
	}

	public String getIdCardBack() {
		return idCardBack;
	}

	public void setIdCardBack(String idCardBack) {
		this.idCardBack = idCardBack;
	}

	public String getLicenseFront() {
		return licenseFront;
	}

	public void setLicenseFront(String licenseFront) {
		this.licenseFront = licenseFront;
	}

	public String getLicenseBack() {
		return licenseBack;
	}

	public void setLicenseBack(String licenseBack) {
		this.licenseBack = licenseBack;
	}

	public String getDriveringFront() {
		return driveringFront;
	}

	public void setDriveringFront(String driveringFront) {
		this.driveringFront = driveringFront;
	}

	public String getDriveringBack() {
		return driveringBack;
	}

	public void setDriveringBack(String driveringBack) {
		this.driveringBack = driveringBack;
	}

	public UserBean getDriverBean() {
		return driverBean;
	}

	public void setDriverBean(UserBean driverBean) {
		this.driverBean = driverBean;
	}

	public TruckBean getTruckBean() {
		return truckBean;
	}

	public void setTruckBean(TruckBean truckBean) {
		this.truckBean = truckBean;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "CredentialsBean [id=" + id + ", number=" + number
				+ ", idCardFront=" + idCardFront + ", idCardBack=" + idCardBack
				+ ", licenseFront=" + licenseFront + ", licenseBack="
				+ licenseBack + ", driveringFront=" + driveringFront
				+ ", driveringBack=" + driveringBack + ", driverBean="
				+ driverBean + ", truckBean=" + truckBean + ", state=" + state
				+ "]";
	}
}
