package com.huangxi.generictype;
//�����
//�ڱ�����T��ʾһ�����ͣ������;�����ʲô����ĵ�����������������������
//����ͨ�õ�д��T:Type E:Element K:Key V:Value
public class Point<T> {
	//private δ֪������ x;
	//private δ֪������ y;
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
