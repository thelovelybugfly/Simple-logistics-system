package com.truck.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.truck.bean.CredentialsBean;
import com.truck.service.ICredentialsService;
import com.truck.service.IDriverService;

@Controller
public class CredentialsController {

	@Autowired
	private ICredentialsService credentialsService;

	@Autowired
	private IDriverService driverService;

	@RequestMapping("/showAllCredentials.action")
	public @ResponseBody Map<String, Object> showAllCredentials(
			String pageForJSP) {

		Map<String, Object> map = new HashMap<String, Object>();

		Integer page = 1;

		try {
			page = Integer.parseInt(pageForJSP);
		} catch (Exception e) {
			// TODO: handle exception
		}

		List<CredentialsBean> credentialsBeans = credentialsService
				.getAllCredentials(page);

		Integer totalPage = credentialsService.getTotalPage();

		System.out.println("credentialsBeans:" + credentialsBeans);
		System.out.println("totalPage:" + totalPage);

		map.put("credentialsBeans", credentialsBeans);
		map.put("totalPage", totalPage);

		return map;
	}

	@RequestMapping("/checkDriver.action")
	public @ResponseBody String checkDriver(Integer id) {
		String message = "";

		Boolean isCheckDriver = credentialsService.credentialsDriver(id);

		if (isCheckDriver == true) {
			message = "操作成功！";
		}

		return message;
	}
}
