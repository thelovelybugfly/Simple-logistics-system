package com.truck.service;

import javax.servlet.http.HttpSession;

import com.truck.bean.UserBean;

/**
 * 用户service接口
 * @author Administrator
 */
public interface IUserService {

	/**
	 * 验证用户登录方法，传入用户名、密码、验证码
	 * @param name
	 * @param pass
	 * @param checkCode
	 * @return
	 */
	public String login(HttpSession session,String account, String passWord, String checkCode);
	
	/**
	 * 用户注册方法，传入一个UserBean、确认密码、验证码
	 * @param userBean
	 * @param passConfirm
	 * @param checkCode
	 * @return
	 */
	public String regist(HttpSession session,UserBean userBean, String passConfirm, String checkCode);
	
	/**
	 * 更新用户信息，传入一个UserBean
	 * @param userBean
	 * @return
	 */
	public boolean updateUserInfo(UserBean userBean);
	/**
	 * 获取手机验证码
	 */
	public String getPhoneCode(HttpSession session,String phone);
}
