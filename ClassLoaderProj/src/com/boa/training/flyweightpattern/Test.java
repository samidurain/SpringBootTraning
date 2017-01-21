package com.boa.training.flyweightpattern;

public class Test {

	public static void main(String[] args) {
		
		ArithOperator operator1 = ArithOperatorFactory.createArithOperator('+');
		System.out.println(operator1.performOperation(10, 6));
		
		ArithOperator operator2 = ArithOperatorFactory.createArithOperator('-');
		System.out.println(operator2.performOperation(10, 6));
		
		ArithOperator operator3 = ArithOperatorFactory.createArithOperator('+');
		System.out.println(operator3.performOperation(70,20));
		
		
	}

}
