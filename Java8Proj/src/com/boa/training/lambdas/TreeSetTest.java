package com.boa.training.lambdas;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Set<String> set=new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				return s2.compareTo(s1);
			}
		});*/
		/*Comparator<String> comparator=(s1,s2)->s2.compareTo(s1);
		Set<String> set=new TreeSet<String>(comparator);*/
		Set<String> set=new TreeSet<String>((s1,s2)->s2.compareTo(s1));
		
		set.add("orange");
		set.add("apple");
		set.add("grape");
		set.add("mango");
		System.out.println(set);

	}
}