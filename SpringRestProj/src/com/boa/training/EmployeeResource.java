package com.boa.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/emp")
public class EmployeeResource {
	
	private TreeMap<Integer, Employee> list=new TreeMap<>();
	public EmployeeResource()
	{
		list.put(1001, new Employee(1001, "Rajiv", "Developer"));
		list.put(1002, new Employee(1002, "Deva", "Accountant"));
		list.put(1003, new Employee(1003, "Suresh", "Architect"));
	}
	
	@RequestMapping(method=RequestMethod.GET,produces={"application/xml","application/json"})
	public @ResponseBody ResponseEntity<Employees> getAllEmployees()
	{
		Employees emps = new Employees(new ArrayList<>(list.values()));
		return new ResponseEntity<Employees>(emps, HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces={"application/xml","application/json"})
	public @ResponseBody ResponseEntity<Employee> findEmployee(@PathVariable("id")int empId)
	{
		Employee employee=list.get(empId);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	

}