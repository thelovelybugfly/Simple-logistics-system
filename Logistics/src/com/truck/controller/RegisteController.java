package com.truck.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.truck.bean.UserBean;
import com.truck.service.IUserService;

/**
 * 注册账号
 * @author j
 *
 */
@Controller
public class RegisteController {
	@Autowired
	private IUserService userService;
	/**
	 * 获取手机验证码
	 * @return
	 */
	@RequestMapping("/getCode.action")
	public @ResponseBody String getCode(HttpServletRequest request,String phone){
		HttpSession session=request.getSession(true);
		return userService.getPhoneCode(session, phone);
	}
	/**
	 * 注册用户
	 * @param session
	 * @param user
	 * @return
	 */
	@RequestMapping("/registe.action")
	public @ResponseBody String registe(HttpServletRequest request,UserBean user,String passConfirm,String checkCode){
		HttpSession session=request.getSession(true);
		return userService.regist(session, user, passConfirm, checkCode);
	}
}
