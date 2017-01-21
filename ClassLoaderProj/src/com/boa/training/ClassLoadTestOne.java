package com.boa.training;

class P {
	static int i=10;
	
	static {
		System.out.println("static block of class P");
	}
}

public class ClassLoadTestOne {
	
	static {
		System.out.println("static block of ClassLoaderTest");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method of ClassLoaderTest");
		System.out.println(P.i);
	}
}
