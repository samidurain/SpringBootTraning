package com.boa.training.domain;

public class Sample {
	
	public void print() {
		Next next = new Next();
		next.test();
	}
	
	public static void printClassLoader() {
		System.out.println("Class Loader of Sample: " + Sample.class.getClassLoader());
	}
	
}
