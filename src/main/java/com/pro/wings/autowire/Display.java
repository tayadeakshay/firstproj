package com.pro.wings.autowire;

public class Display {

	String type;
	int size;
	public Display() {
	}
	public Display(String type, int size) {
		super();
		this.type = type;
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "[type=" + type + ", size=" + size + "]";
	}
	
	
	
}
