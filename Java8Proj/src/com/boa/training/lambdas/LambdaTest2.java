package com.boa.training.lambdas;

import java.util.ArrayList;
import java.util.List;

class Utility {
	public static void manipulate(String s) {
		System.out.println(s);
	}
}

public class LambdaTest2 {
	public static void testMethod(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Grape");
		
		/*for(String fruit : list) {
			System.out.println(fruit);
		}*/
		
		list.forEach(f -> System.out.println(f));
		System.out.println("------------------------");
		list.forEach(Utility::manipulate);
		System.out.println("------------------------");
		list.forEach(LambdaTest2::testMethod);
	}

}
