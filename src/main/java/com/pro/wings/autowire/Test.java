package com.pro.wings.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		LapTop laptop = ctx.getBean(LapTop.class);
		
		System.out.println(laptop);
		
	}
}
