package com.boa.training.lambdas;

@FunctionalInterface
interface First {
	String getMessage(String name);
}

@FunctionalInterface
interface Second {
	double manipulate(int second);
	
	default String getData() {
		return "this is a test";
	}
}

public class LambdaTest1 {

	public static void main(String[] args) {
		
		/*First first = (String s) -> {
			return "Welcome to Lamda" + s;
		};*/
		
		/*First first = s -> {
			return "Welcome to Lamda" + s;
		};*/
		
		First first = s -> "Welcome to Lamda " + s;
		System.out.println(first.getMessage("Anil"));
		
		Second second = Math::sqrt;
		System.out.println(second.manipulate(25));

	}

}
