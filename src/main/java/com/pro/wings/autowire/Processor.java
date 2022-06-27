package com.pro.wings.autowire;

public class Processor {

	String companyName;
	int generation;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getGeneration() {
		return generation;
	}
	public void setGeneration(int generation) {
		this.generation = generation;
	}
	public Processor(String companyName, int generation) {
		this.companyName = companyName;
		this.generation = generation;
	}
	public Processor() {
	}
	@Override
	public String toString() {
		return "[companyName=" + companyName + ", generation=" + generation + "]";
	}
	
	
}
