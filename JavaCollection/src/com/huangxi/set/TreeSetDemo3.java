package com.huangxi.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/*TreeSet排序规则：（2）定制排序，必须实现Comparator接口，覆盖compare方法
 * 
 * */
class Person2 {
	private String name;
	private int age;
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	
}


//第三方：实现comparator接口
class NameLengthComparator implements Comparator<Person2>{

	//覆盖compare方法，编写比较规则
	@Override
	public int compare(Person2 o1, Person2 o2) {
		if(o1.getName().length()>o2.getName().length()){
			return 1;
		}else if(o1.getName().length()<o2.getName().length()){
			return -1;
		}else if(o1.getAge()>o2.getAge()){//如果名字长度相等再按照年龄排序
			return 1;
		}else if(o1.getAge()<o2.getAge()){
			return -1;
		}
		return 0;//认为是同一个对象
	}
	
}
public class TreeSetDemo3 {
	//定制排序：按照名字长度排序
public static void main(String[] args) {
	Set<Person2> set=new TreeSet<>(new NameLengthComparator());//注意把比较器丢进去
	set.add(new Person2("张三一",18));
	set.add(new Person2("李四",56));
	set.add(new Person2("王二麻子",33));
	set.add(new Person2("小明",67));
	System.out.println(set);//[Person2 [name=李四, age=56], Person2 [name=小明, age=67], Person2 [name=张三一, age=18], Person2 [name=王二麻子, age=33]]
}
}
