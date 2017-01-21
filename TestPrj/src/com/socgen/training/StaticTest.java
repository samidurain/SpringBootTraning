package com.socgen.training;

class X{
	static int i=10;
	
	static{
		System.out.println("static block of X");
	}
}

public class StaticTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Beginnig of main method of StaticTest");
		//X x=new X();
		System.out.println(X.i);
		System.out.println("End of main method of StaticTest");

	}
	static{
		System.out.println("static block of StaticTest");
	}

}
