package com.socgen.training.deadlock;

public class SecondThread extends Thread {
	private A a;
	private B b;
	public SecondThread(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (b) {
			System.out.println("SecondThread has acquired lock on object b");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("SecondThread is waiting to acquire lock object a");
			synchronized (a) {
				System.out.println("SecondThread has acquired lock on object a");
			}
		}
	}
	
	

}
