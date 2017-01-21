package com.boa.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.training.repository.EmployeeRepository;
import com.boa.training.domain.Employee;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping(value="/", produces="application/json")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}
