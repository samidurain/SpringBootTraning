package com.boa.training.lambdas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;



public class EmployeeUtility {
	private Map<Integer, Employee> list=new HashMap<Integer, Employee>();

	public EmployeeUtility() {
		super();
		// TODO Auto-generated constructor stub
		list.put(101, new Employee(101, "Arvind", "Developer", 40000));
		list.put(102, new Employee(102, "Deva", "Accountant", 30000));
		list.put(103, new Employee(103, "Ramesh", "Team Lead", 60000));
		list.put(104, new Employee(104, "Kushal", "Developer", 45000));		
		list.put(105, new Employee(105, "Arun", "Architect", 85000));
	}
	
	public Optional<Employee> findEmployeeWithOption(int id)
	{
		Employee e=list.get(id);
		return e==null?Optional.empty():Optional.of(e);
	}
	
	public Employee findEmployee(int id)
	{
		return list.get(id);
		
	}
	public List<Employee> findBySalary(double salary)
	{
		Predicate<Employee> predicate=e->e.getSalary()>=salary;
		List<Employee> subList=new ArrayList<Employee>();
		for(Employee e:list.values()){
			if(predicate.test(e)){
				subList.add(e);
			}
		}
		return subList;
	}
	
	public Collection<Employee> getAllEmployees()
	{
		return list.values();
	}
}