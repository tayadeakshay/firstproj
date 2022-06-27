package com.pro.wings;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorld h1 = (HelloWorld) context.getBean("helloworld");
		
//		Student s1 = (Student) context.getBean("std");
		Student s2 = (Student) context.getBean("std1");

		int count =context.getBeanDefinitionCount();
		String[] name=context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(name));
//		System.out.println(count);
		System.out.println(s2);
//		System.out.println(h1);
//		System.out.println(s1);
	
		context.registerShutdownHook();
	}
}
