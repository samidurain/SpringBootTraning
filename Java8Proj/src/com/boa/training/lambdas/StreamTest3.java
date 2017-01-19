package com.boa.training.lambdas;

import java.util.Arrays;
import java.util.List;

public class StreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int noOfCpus=Runtime.getRuntime().availableProcessors();
		System.out.println("Total number of cpus available: "+noOfCpus);
		
	Integer[] array=new Integer[30];
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*500);
		}
		List<Integer> list=Arrays.asList(array);
		list.stream().parallel().
		forEach(no->{
			System.out.println(Thread.currentThread().getName()+" "+no);
		});
	}

}