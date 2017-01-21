package com.boa.training.domain;

public class Next {

	public void test() {
		System.out.println("test method of Next");
		printClassLoader();
	}
	
	public static void printClassLoader() {
		System.out.println("Class Loader of Next : " + Next.class.getClassLoader());
	}
}
