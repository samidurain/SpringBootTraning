package com.boa.training;

class A {
	
}

public class ClassLoaderTest {

	public static void main(String[] args) {
		System.out.println("Class Loade of A : " + A.class.getClassLoader());
		System.out.println("Class Loader of String : " + String.class.getClassLoader());
	}

}
