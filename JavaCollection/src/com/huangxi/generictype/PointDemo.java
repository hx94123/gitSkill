package com.huangxi.generictype;

public class PointDemo {
	//��ָ��Ĭ����Object����
	
	//ʹ��String����
	Point<String> p1=new Point<String>();
	String x1=p1.getX();
	//ʹ��Integer����
	Point<Integer> p2=new Point<Integer>();
	Integer x2=p2.getX();
	//ʹ��Double����
	Point<Double> p3=new Point<Double>();
	Double x3=p3.getX();
}
