package com.pro.wings;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student{

	private int roll;
	private String name;
	private Address addr;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
	//	System.out.println("Inside Student setter");
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//System.out.println("Inside Student setter");
		this.name = name;
		
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
	//	System.out.println("Inside Student setter");
		this.addr = addr;
	}
	public Student(int roll, String name, Address addr) {
		super();
		//System.out.println("Inside Student constructor");
		this.roll = roll;
		this.name = name;
		this.addr = addr;
	}
	@PostConstruct
	public void init()
	{
		//System.out.println("Inside init method of Student");
	}
	@PreDestroy
	public void destroy1()
	{
		System.out.println("Inside destroy methd of Student");
	}
	public Student() {
		super();
		System.out.println("Inside Student constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", addr=" + addr + "]";
	}

	
}
