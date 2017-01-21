package com.boa.training.domain;

import java.io.FileOutputStream;

class MyResource implements AutoCloseable { 
	@Override
	public void close() throws Exception {
		System.out.println("Closing MyResource");		
	}
}

public class FinallyTest {
	public static void main(String[] args) {
		try(MyResource resource = new MyResource(); FileOutputStream fout = new FileOutputStream("x.txt")) {
			System.out.println("Doing somethig with resource");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
