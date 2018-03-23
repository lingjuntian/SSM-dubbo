package com.test.crm.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.crm.service.IHelloService;

@Controller
@RequestMapping("/test")
public class HelloController {
	
	@Resource
	private IHelloService helloService;
	
	@RequestMapping("/say")
	@ResponseBody
	public String Say(){
		
		return helloService.welcome();
	}
	
}
