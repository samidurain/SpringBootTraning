package com.boa.training.lambdas;

interface A {
	public int getData(B b, int x1, int x2, int x3);
}

class B {
	public int getValue(int a, int b, int c) {
		return a+b+c;
	}
}

public class LambdaTest3 {
	public static void main(String[] args) {
		A a = B::getValue;
		System.out.println(a.getData(new B(), 10, 20, 30));
	}
}
