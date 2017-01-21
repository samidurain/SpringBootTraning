package com.socgen.training;

public class GraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphUtility utility=new GraphUtility();
		for(int i=1;i<=500;i++){
			Point[] points=new Point[i*100];
			for(int j=0;j<points.length;j++){
				points[j]=new Point(j+100, j+200);
			}
			Graph graph=new Graph(points);
			utility.processGraph(graph);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
