package com.socgen.training.deadlock;

public class FirstThread extends Thread{
	private A a;
	private B b;
	public FirstThread(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (a) {
			System.out.println("First Thread has acquired lock on object a");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("First Thread is waiting to acquire lock on object b");
			synchronized (b) {
				System.out.println("First Thread has acquired lock on object b");
			}
		}
	}
	
	
	
	

}
