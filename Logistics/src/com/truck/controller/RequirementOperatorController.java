package com.truck.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.truck.bean.UserBean;
import com.truck.bean.UserRequirementBean;
import com.truck.service.IDriverService;

/**
 * 此控制器处理与用户需求相关的请求
 * 
 * @author lsl
 * @version 1.0
 */
@Controller
public class RequirementOperatorController {

	@Autowired
	private IDriverService driverService;

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/queryRequirement.action")
	public @ResponseBody Map<String, Object> queryRequirements(
			UserRequirementBean bean, @RequestParam("curPage") int curPage) {
		/*
		 * System.out.println(bean); System.out.println(bean.getOrigin());
		 * System.out.println(curPage);
		 */
		List<UserRequirementBean> list = driverService
				.getLimittedUserRequirementBean(bean, curPage);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list);
		int pages = driverService.getTotalPage(bean);
		System.out.println(pages);
		map.put("pages", pages);
		/* mView.setViewName("jsp/selectNeeds.jsp"); */
		return map;
	}

	@RequestMapping("/order.action")
	public @ResponseBody boolean getOrder(int id, HttpSession session) {
		System.out.println(id);
		UserBean bean = (UserBean) session.getAttribute("account");
		boolean result = driverService.generateOrder(id, bean);
		return result;
	}
}
