package com.truck.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truck.bean.UserBean;
import com.truck.dao.IUserDao;
import com.truck.service.IUserService;
import com.truck.tools.SMSCodeUtil;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public String login(HttpSession session,String account, String passWord, String checkCode) {
		//账号验证规则 11位手机号码
		String accountRegEx="^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
		//密码验证规则 6-16位必须由字母和数字组合的密码
		String passWordRegEx="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$";
		if(!account.matches(accountRegEx)){
			return "账号格式错误";
		}
		if(!passWord.matches(passWordRegEx)){
			return "密码格式错误";
		}
		String oldCheckCode = (String) session.getAttribute("checkCode");
		if(null==checkCode||"nocach".equals(oldCheckCode)|| !(oldCheckCode.equalsIgnoreCase(checkCode))){
			session.setAttribute("checkCode", "nocach");
			return "验证码错误";
		}
		//验证密码是否正确
		UserBean user=userDao.selectUserByName(account);
		if(user==null){
			return "账号不存在";
		}
		if(user.getPass().equals(passWord)){
			session.setAttribute("account", user);
			if(user.getRole()==1){
				return "用户登录成功";
			}else if(user.getRole()==2){
				return "司机登录成功";
			}else{
				return "管理员登录成功";
			}
		}else{
			return "密码错误";
		}
		
	}

	@Override
	public String regist(HttpSession session,UserBean userBean, String passConfirm, String checkCode) {
		//账号验证规则 11位手机号码
		String accountRegEx="^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
		//密码验证规则 6-16位必须由字母和数字组合的密码
		String passWordRegEx="^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,16}$";
		//身份证正则表达式
		String idCodeRegEx="^(^[1-9]\\d{7}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}$)|(^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])((\\d{4})|\\d{3}[Xx])$)$";
		//获取session中的code
		String code=(String)session.getAttribute("phoneCode");
		if(!userBean.getName().matches(accountRegEx)){
			return "账号格式错误";
		}
		if(!userBean.getPass().matches(passWordRegEx)){
			return "密码格式错误";
		}
		if(!passConfirm.matches(passWordRegEx)){
			return "重复密码格式错误";
		}
		if(!passConfirm.equals(userBean.getPass())){
			return "两次密码不一致";
		}
		if(userBean.getRealName()==null || "".equals(userBean.getRealName())){
			return "名字不能为空";
		}
		if(!userBean.getIdNumber().matches(idCodeRegEx)){
			return "身份证格式错误";
		}
		System.out.println("性别："+userBean.getSex());
		if(userBean.getSex()==null ||(!userBean.getSex().equals("男") && !userBean.getSex().equals("女")) ){
			return "性别格式错误";
		}	
		UserBean oldUserBean=userDao.selectUserByName(userBean.getName());
		if(oldUserBean!=null){
			return "该手机号码已注册过";
		}
		if(null==code){
			return "未请求验证码";
		}
		if(code==null || !code.equals(checkCode)){
			return "验证码不正确";
		}
		userDao.insertUser(userBean);
		return "成功";
	}
	@Override
	public boolean updateUserInfo(UserBean userBean) {
		boolean isUpdate = false;
		
		return isUpdate;
	}

	@Override
	public String getPhoneCode(HttpSession session,String phone) {
		//账号验证规则 11位手机号码
		String accountRegEx="^(13[0-9]|14[579]|15[0-3,5-9]|16[6]|17[0135678]|18[0-9]|19[89])\\d{8}$";
		if(!phone.matches(accountRegEx)){
			return "手机格式错误";
		}
		UserBean oldUserBean=userDao.selectUserByName(phone);
		if(oldUserBean!=null){
			return "该手机号码已注册过";
		}
		try {
			if(SMSCodeUtil.sendCode(session, phone)){
				return "成功";
			}else{
				return "5分钟后才能获取验证码";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "系统繁忙";
	}
}
