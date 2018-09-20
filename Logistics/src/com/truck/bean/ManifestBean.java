package com.truck.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 货物清单类
 * 属性：主键	-->	id
 * 		名字	-->	name
 * 		数量	-->	count
 * 		订单 -->	orderBean
 * @author Administrator
 */
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class ManifestBean {

	private Integer id;
	private String name;
	private Integer count;
	private UserRequirementBean userRequirementBean;
	
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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public UserRequirementBean getUserRequirementBean() {
		return userRequirementBean;
	}
	public void setUserRequirementBean(UserRequirementBean userRequirementBean) {
		this.userRequirementBean = userRequirementBean;
	}
	
	@Override
	public String toString() {
		return "ManifestBean [id=" + id + ", name=" + name + ", count=" + count
				+ ", userRequirementBean=" + userRequirementBean + "]";
	}
}
