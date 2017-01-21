package com.socgen.training.deadlock;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		A a=new A();
		B b=new B();
		FirstThread f=new FirstThread(a, b);
		f.setName("First Thread");
		SecondThread s=new SecondThread(a, b);
		s.setName("Second Thread");
		f.start();
		s.start();

	}

}
