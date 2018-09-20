package com.truck.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.truck.bean.TalkBean;
import com.truck.bean.UserBean;
import com.truck.service.IShowTalkService;

@Controller
public class ShowTalkController {
	@Autowired
	private IShowTalkService show;
	@RequestMapping("/showtalk.action")
	public ModelAndView showtalk(HttpServletRequest request){
		System.out.println("正在执行controller");
		 List<TalkBean> list=show.findAll();
		for (TalkBean talkBean : list) {
			System.out.println(talkBean);
		}
		 ModelAndView mView=new ModelAndView();
		 mView.addObject("list", list);
		 mView.setViewName("jsp/show_talk.jsp");
		return mView;
	}
	
	@RequestMapping("/addtalk.action")
	public ModelAndView addtalk(HttpServletRequest request,HttpSession session){
		
		System.out.println("正在执行controller");
		UserBean bean=(UserBean) session.getAttribute("account");
		String name=bean.getRealName();
		
		String text=request.getParameter("text");
		System.out.println("姓名："+name+"内容："+text);
		 ModelAndView mView=new ModelAndView();
		
		 mView.setViewName("/showtalk.action");
		return mView;
	}
}
