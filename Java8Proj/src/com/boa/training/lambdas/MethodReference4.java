package com.boa.training.lambdas;

interface C {
	int manipulate(String s1, String s2);
}

public class MethodReference4 {
	public static void main(String[] args) {
		C c1 = String::indexOf;
		
		
	}
}
