package com.huangxi.set;

import java.util.Set;
import java.util.TreeSet;

/*TreeSet排序规则：（1）自然排序，必须实现Comparable接口，覆盖compareTto方法
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
	
	//必须覆盖compareTo方法！！！！
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
	//按照年龄做自然排序
public static void main(String[] args) {
	Set<Person> set=new TreeSet<>();
	set.add(new Person("张三",18));
	set.add(new Person("李四",56));
	set.add(new Person("王二麻子",33));
	set.add(new Person("小明",67));
	System.out.println(set);//没有实现Comparable接口，覆盖compareTo方法 报异常 
	//实现自然排序后，[Person [name=张三, age=18], Person [name=王二麻子, age=33], Person [name=李四, age=56], Person [name=小明, age=67]]
}
}
