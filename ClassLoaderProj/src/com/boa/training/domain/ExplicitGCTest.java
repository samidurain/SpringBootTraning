package com.boa.training.domain;

public class ExplicitGCTest {

	public static void main(String[] args) {
		for(int i=1; i<=20; i++)
			System.gc();
	}

}
