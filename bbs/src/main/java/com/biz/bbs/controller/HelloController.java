package com.biz.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping(value = "")
	public String Hello() {
		return "Hello Spring Boot";
	}
	
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/hello")
	public String Hello2(Model model) {
		model.addAttribute("username","홍길동");
		model.addAttribute("tell","010-111-1111");
		return "hello";
	}
}
