package com.boa.training.lambdas;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(101, "Anil", 5000));
		list.add(new Customer(102,"Xevier", 9000));
		list.add(new Customer(103,"Balaa", 4500));
		
		list.stream().filter(c -> c.getBalance() >= 4500).forEach(System.out::println);
		
	}

}
