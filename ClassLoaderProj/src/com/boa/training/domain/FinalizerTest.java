package com.boa.training.domain;

class X {
	private int i;
	
	public X(int i) {
		super();
		this.i = i;
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalizing the object with the value "+i);
	}
	
}

public class FinalizerTest {
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			X x1 = new X(i);
		}
		
		for(int i=1; i<=10; i++) {
			System.gc();
		}
		
		throw new OutOfMemoryError("No sufficient memory");
	}

}