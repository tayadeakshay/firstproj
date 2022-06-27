package com.pro.wings.autowire;

public class Memory {

	String sizeOfRAM;
	String sizeOfSSD;
	public Memory() {
	}
	public Memory(String sizeOfRAM, String sizeOfSSD) {
		this.sizeOfRAM = sizeOfRAM;
		this.sizeOfSSD = sizeOfSSD;
	}
	public String getSizeOfRAM() {
		return sizeOfRAM;
	}
	public void setSizeOfRAM(String sizeOfRAM) {
		this.sizeOfRAM = sizeOfRAM;
	}
	public String getSizeOfSSD() {
		return sizeOfSSD;
	}
	public void setSizeOfSSD(String sizeOfSSD) {
		this.sizeOfSSD = sizeOfSSD;
	}
	@Override
	public String toString() {
		return "[sizeOfRAM=" + sizeOfRAM + ", sizeOfSSD=" + sizeOfSSD + "]";
	}
	
	
}
