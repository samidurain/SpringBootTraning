package com.boa.training.domain;

public class Employee {
	private int empid;
	private String name;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
