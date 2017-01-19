package com.boa.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.training.repository.EmployeeRepository;
import com.boa.training.domain.Employee;
import com.boa.training.domain.MyAppProperties;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private MyAppProperties myAppProperties;
	
	@GetMapping(value="/", produces="application/json")
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping(value="/myproperties",produces="text/html")
	public String getProperties()
	{
		String resp="<html><body>";
		resp+="<h3>Host Name: "+myAppProperties.getHostname();
		resp+="<br>Ip Address: "+myAppProperties.getIp();
		resp+="<br>Location: "+myAppProperties.getLocation();
		resp+="</h3></body></html>";
		return resp;
	}
}
