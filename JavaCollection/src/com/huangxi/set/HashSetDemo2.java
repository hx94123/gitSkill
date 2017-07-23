package com.huangxi.set;

import java.util.HashSet;
import java.util.Set;
/*如果需要把我们自定义的对象存储到哈希表中，该类型的对象应该覆盖hashCode和equals方法，并在该方法中提供自己的判断规则*/


class Student{
	private int sn;
	private String name;
	private int age;
	public Student(int sn, String name, int age) {
		this.sn = sn;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [sn=" + sn + ", name=" + name + ", age=" + age + "]";
	}
	
	
	//希望根据学号和姓名来创建hashcode和equals方法，自动生成即可！！
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sn;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sn != other.sn)
			return false;
		return true;
	}
	
}

public class HashSetDemo2 {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add(new Student(1,"张三",17));
		set.add(new Student(1,"张三",17));
		set.add(new Student(2,"李四",18));
		set.add(new Student(3,"王二麻子",18));
		System.out.println(set.size());//3
		System.out.println(set);//[Student [sn=1, name=张三, age=17], Student [sn=3, name=王二麻子, age=18], Student [sn=2, name=李四, age=18]]

	}
	
}
