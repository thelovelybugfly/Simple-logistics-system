package com.truck.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.truck.service.IUserService;
import com.truck.tools.CheckCodeUtil;
/**
 * 登录的相关页面
 * @author j
 *
 */
@Controller
public class LoginController {
	/**
	 * 用户登录
	 */
	@Autowired
	private IUserService userService;
	@RequestMapping("/login.action")
	public @ResponseBody String Login(HttpServletRequest request,String account,String passWord,String checkCode){
		String result=userService.login(request.getSession(true),account, passWord, checkCode);
		return result;
	}
	/**
	 * 获取验证码
	 * @param request
	 * @param response
	 */
	@RequestMapping("/getcheckcode.action")
	public void getCheckCode(HttpServletRequest request,HttpServletResponse response){
		System.out.println("获得验证码");
		response.setHeader("Pragma", "No-cache");
		response.setHeader("Cache-Control", "No-cache");
		response.setDateHeader("Expires", 0);
		// 指定生成的响应是图片
		response.setContentType("image/jpeg");
		HttpSession session=request.getSession();
		BufferedImage image=CheckCodeUtil.getcheckCode(session);
		try {
			ImageIO.write(image, "JPEG", response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
