package com.huangxi.set;

import java.util.Set;
import java.util.TreeSet;

/*TreeSet������򣺣�1����Ȼ���򣬱���ʵ��Comparable�ӿڣ�����compareTto����
 * 
 * */

class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//���븲��compareTo������������
	@Override
	public int compareTo(Person other) {
		if(this.age>other.age){
			return 1;
		}else if(this.age<other.age){
			return -1;
		}
		return 0;
	}
	
}
public class TreeSetDemo2 {
	//������������Ȼ����
public static void main(String[] args) {
	Set<Person> set=new TreeSet<>();
	set.add(new Person("����",18));
	set.add(new Person("����",56));
	set.add(new Person("��������",33));
	set.add(new Person("С��",67));
	System.out.println(set);//û��ʵ��Comparable�ӿڣ�����compareTo���� ���쳣 
	//ʵ����Ȼ�����[Person [name=����, age=18], Person [name=��������, age=33], Person [name=����, age=56], Person [name=С��, age=67]]
}
}
