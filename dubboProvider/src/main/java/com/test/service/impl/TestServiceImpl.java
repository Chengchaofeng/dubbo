package com.test.service.impl;

import com.test.service.TestService;

public class TestServiceImpl implements TestService {

	public String sayWord(String name) {
		  
		return "欢迎登录大数据平台     Author:" + name;
	}

}
