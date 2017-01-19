package com.boa.training;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employees {
	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(List<Employee> employees) {
		super();
		this.employees = employees;
	}
	
}
