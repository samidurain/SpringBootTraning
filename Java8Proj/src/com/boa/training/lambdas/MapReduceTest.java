package com.boa.training.lambdas;


public class MapReduceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility=new EmployeeUtility();
		double sum=utility.getAllEmployees().stream().parallel().mapToDouble(Employee::getSalary).sum();
		System.out.println("sum of salary of all employees: "+sum);
		sum=utility.getAllEmployees().stream().parallel().mapToDouble(Employee::getSalary).reduce(0, (x,y)->x+y);
		System.out.println(sum);
		System.out.println(utility.getAllEmployees().stream().map(Employee::getName).reduce("", (s1,s2)->s1+"-"+s2));
	}

}