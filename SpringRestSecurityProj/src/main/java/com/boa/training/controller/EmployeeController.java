package com.boa.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.training.domain.Employees;
import com.boa.training.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@GetMapping(value="/api", produces="application/json")
	public Employees getAllEmployees() {
		return new Employees(employeeRepository.findAll());
	}
	
	
}
