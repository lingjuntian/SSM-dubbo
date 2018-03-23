package com.test.crm.provider.impl;

import org.springframework.stereotype.Service;

import com.test.crm.service.IHelloService;

@Service("helloService")
public class HelloServiceImpl implements IHelloService {

	public String welcome() {
		return "Hello";
	}

}
