package com.boa.training.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class ArithOperatorFactory {
	private static Map<Character, ArithOperator> cache=new HashMap<>();
	
	public static ArithOperator createArithOperator(char op)
	{
		ArithOperator operator=null;
		if(cache.containsKey(op)){
			operator=cache.get(op);
		}
		else{
			operator=new ArithOperator(op);
			cache.put(op, operator);
		}
		return operator;
		
	}

}