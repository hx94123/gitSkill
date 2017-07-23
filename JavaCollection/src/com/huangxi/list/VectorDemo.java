package com.huangxi.list;
import java.util.Arrays;
import java.util.Vector;

@SuppressWarnings("all")
public class VectorDemo {
/**
 * @param args
 */
	private static void testAdd(){
		Vector v1=new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		System.out.println(v1);
		v1.add(1, "huangxi");
		System.out.println(v1);//[A, huangxi, B, C]��ʵ�ǻ�������Ĳ��룬���ܵͣ�
		
		
		Vector v2=new Vector();
		v2.add("a");
		v2.add("b");
		//v1.add(v2);[A, huangxi, B, C, [a, b]]
		v1.addAll(v2);
		System.out.println(v1);//[A, huangxi, B, C, a, b]
	}
	
	private static void testRemove(){
		Vector v1=new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("B");
		//v1.remove(0);[B, C, B]
		//v1.remove("B");[C, B]ɾ����һ��B
		
		Vector v2=new Vector();
		v2.add("C");
		v2.add("B");
		//v1.addAll(v2);[A, B, C, B, C, B]
		//v1.removeAll(v2);[A]ɾ����v2����ͬ�Ķ���  ��APIԴ�룡
		//v1.retainAll(v2);[B, C, B] ������v2����ͬ�Ķ��� ����
	}
	
	private static void testUpdate() {
		Vector v1=new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.set(1, "huangxi");
		System.out.println(v1);//[A, huangxi, C]
		
	}
	private static void testGet() {
		Vector v1=new Vector();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		System.out.println(v1.size());//3
		System.out.println(v1.isEmpty());//false
		System.out.println(v1.get(1));//B
		System.out.println(v1.toArray());//[Ljava.lang.Object;@15db9742 ת����������� ע��ײ㷵�ص�������ĸ��� return Arrays.copyOf(elementData, elementCount)��ȫ�����
		
		
	}
public static void main(String[] args) {
	/*
	//����ֻ�ܴ洢����Vector���̰߳�ȫ��
	Vector v=new Vector(5);
	v.addElement(12);//����ֻ�ܴ洢���󣬵���java5�Ժ��Զ�װ��
	v.add(Integer.valueOf(123));//java5֮ǰ
	v.add(1212);//1.2֮ǰ��addElement������֮����add��ʵ����ȫһ��
	System.out.println(v);
	
	//���ϴ洢���Ƕ��������
	StringBuilder sb=new StringBuilder();
	sb.append("abc");
	v.add(sb);
	System.out.println(v);//[12, 123, 1212, abc]
	sb.append("def");
	System.out.println(v);//[12, 123, 1212, abcdef]
*/	
	
	
	
	
	
	//testAdd();
	//testRemove();
	//testUpdate();
	//testGet();
	
}




}
