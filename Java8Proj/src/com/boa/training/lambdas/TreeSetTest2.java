package com.boa.training.lambdas;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> set = new TreeSet<Employee>((e1, e2) -> new Double(
				e2.getSalary()).compareTo(e1.getSalary()));
		
		set.add(new Employee(101, "Arjun", "Developer", 40000));
		set.add(new Employee(102, "Deva", "Architect", 100000));
		set.add(new Employee(103, "Arvind", "Accountant", 30000));
		set.add(new Employee(104, "Rajiv", "Team Lead", 60000));
		System.out.println(set);

	}

}