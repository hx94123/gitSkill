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
		System.out.println(v1);//[A, huangxi, B, C]其实是基于数组的插入，性能低！
		
		
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
		//v1.remove("B");[C, B]删除第一个B
		
		Vector v2=new Vector();
		v2.add("C");
		v2.add("B");
		//v1.addAll(v2);[A, B, C, B, C, B]
		//v1.removeAll(v2);[A]删除与v2中相同的对象  看API源码！
		//v1.retainAll(v2);[B, C, B] 保留与v2中相同的对象 交集
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
		System.out.println(v1.toArray());//[Ljava.lang.Object;@15db9742 转换成数组对象 注意底层返回的是数组的副本 return Arrays.copyOf(elementData, elementCount)安全起见！
		
		
	}
public static void main(String[] args) {
	/*
	//集合只能存储对象，Vector是线程安全的
	Vector v=new Vector(5);
	v.addElement(12);//集合只能存储对象，但是java5以后自动装箱
	v.add(Integer.valueOf(123));//java5之前
	v.add(1212);//1.2之前是addElement方法，之后是add，实现完全一样
	System.out.println(v);
	
	//集合存储的是对象的引用
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
