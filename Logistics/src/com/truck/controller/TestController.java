package com.truck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.truck.service.IServiceTest;

@Controller
public class TestController {
	@Autowired
	public IServiceTest test;
	@RequestMapping("/test.action")
	public void test(){
		test.myTest();
	}
}
