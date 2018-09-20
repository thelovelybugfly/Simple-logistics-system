package com.truck.service;

import java.util.List;

import com.truck.bean.CredentialsBean;

public interface ICredentialsService {

	/**
	 * 司机上传认证信息，传入认证bean，CredentialsBean
	 * @param credentialsBean
	 * @return
	 */
	public boolean uploadCredentials(CredentialsBean credentialsBean);
	
	/**
	 * 分页显示已通过审核的司机认证信息
	 * @param page当前页码
	 * @return
	 */
	public List<CredentialsBean> getIsCredentials(Integer page);
	
	/**
	 * 分页显示未通过审核的司机认证信息
	 * @param page当前页码
	 * @return
	 */
	public List<CredentialsBean> getNotCredentials(Integer page);
	
	/**
	 * 分页显示所有司机认证信息
	 * @param page当前页码
	 * @return
	 */
	public List<CredentialsBean> getAllCredentials(Integer page);
	
	/**
	 * 管理员审核司机认证信息，传入id
	 * @param id
	 * @return
	 */
	public boolean credentialsDriver(Integer id);
	
	/**
	 * 所有认证信息分页总页数
	 * @return
	 */
	public Integer getTotalPage();
	
	/**
	 * 已通过认证的认证信息分页总页数
	 * @return
	 */
	public Integer getTotalPageIsCredentials();
	
	/**
	 * 未通过认证的认证信息分页总页数
	 * @return
	 */
	public Integer getTotalPageNotCredentials();
}
