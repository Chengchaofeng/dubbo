package com.test.action;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.TestService;

public class TestMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		TestService ts = (TestService) context.getBean("demoService");
		System.out.println(ts.sayWord("by 、咕咚"));
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
