package com.pro.wings.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class LapTop {

	String companyName;
	int serialNo;

	@Autowired
	Display display;
	Processor processor;
	Memory memory;
	
	public Processor getProcessor() {
		return processor;
	}
	@Autowired
	@Qualifier("processor2")
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	
	public LapTop() {
	}
	
	@Autowired
	public LapTop(Memory memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "LapTop [companyName=" + companyName + ", serialNo=" + serialNo + "]\r\n" + "Display=" + display + "\r\n" +"Processor="
				+ processor +"\r\n" + "Memory=" + memory ;
	}
	
	
	
}
