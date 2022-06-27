package com.pro.wings;

public class Address{

	private int pin;
	private String city;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
	//	System.out.println("Inside addr setter");
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
	//	System.out.println("Inside addr setter");
		this.city = city;
	}
	public Address(int pin, String city) {
		super();
	//	System.out.println("Inside addr constructor");
		this.pin = pin;
		this.city = city;
	}
	public Address() {
		super();
	//	System.out.println("Inside addr constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
	
}
