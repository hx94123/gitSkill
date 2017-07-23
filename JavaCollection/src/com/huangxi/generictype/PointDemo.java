package com.huangxi.generictype;

public class PointDemo {
	//不指明默认是Object类型
	
	//使用String类型
	Point<String> p1=new Point<String>();
	String x1=p1.getX();
	//使用Integer类型
	Point<Integer> p2=new Point<Integer>();
	Integer x2=p2.getX();
	//使用Double类型
	Point<Double> p3=new Point<Double>();
	Double x3=p3.getX();
}
