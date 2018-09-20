package com.truck.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 用户类User

 * 属性：主键			-->	id
 * 		用户名		-->	name
 * 		密码			-->	pass
 * 		真实姓名		-->	realName
 * 		身份证号		-->	idNumber
 * 		性别			-->	sex
 * 		用户需求集合	-->	userRequirementBeans
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class UserBean {

	private Integer id;
	private String name;
	private String pass;
	private String realName;
	private String idNumber;
	private String sex;
	private Integer role;// 默认值为1，代表为普通用户。2为司机，3为管理

	// 一个用户有多个需求
	private List<UserRequirementBean> userRequirementBeans;

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<UserRequirementBean> getUserRequirementBeans() {
		return userRequirementBeans;
	}

	public void setUserRequirementBeans(
			List<UserRequirementBean> userRequirementBeans) {
		this.userRequirementBeans = userRequirementBeans;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", pass=" + pass
				+ ", realName=" + realName + ", idNumber=" + idNumber
				+ ", sex=" + sex + ", userRequirementBeans="
				+ userRequirementBeans + "]";
	}
}
