package com.huangxi.generictype;
//点对象
//在本类中T表示一种类型，该类型具体是什么由类的调用者来决定！！！！！！
//四种通用的写法T:Type E:Element K:Key V:Value
public class Point<T> {
	//private 未知的类型 x;
	//private 未知的类型 y;
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
}
