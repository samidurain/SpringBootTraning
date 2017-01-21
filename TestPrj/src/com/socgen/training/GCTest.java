package com.socgen.training;

class Y{
	private int i;

	public Y(int i) {
		super();
		this.i = i;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("garbage collecting the object with value: "+i);
	}
	
}

public class GCTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y y1=new Y(10);
		Y y2=y1;
		y1=null;
		Y y3=y2;
		y2=new Y(20);
		y3=new Y(30);
		y2=null;
		y3=y1;

		for(int i=1;i<=20;i++){
			System.gc();
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
