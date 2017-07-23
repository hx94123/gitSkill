package com.huangxi.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/*TreeSet������򣺣�2���������򣬱���ʵ��Comparator�ӿڣ�����compare����
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


//��������ʵ��comparator�ӿ�
class NameLengthComparator implements Comparator<Person2>{

	//����compare��������д�ȽϹ���
	@Override
	public int compare(Person2 o1, Person2 o2) {
		if(o1.getName().length()>o2.getName().length()){
			return 1;
		}else if(o1.getName().length()<o2.getName().length()){
			return -1;
		}else if(o1.getAge()>o2.getAge()){//������ֳ�������ٰ�����������
			return 1;
		}else if(o1.getAge()<o2.getAge()){
			return -1;
		}
		return 0;//��Ϊ��ͬһ������
	}
	
}
public class TreeSetDemo3 {
	//�������򣺰������ֳ�������
public static void main(String[] args) {
	Set<Person2> set=new TreeSet<>(new NameLengthComparator());//ע��ѱȽ�������ȥ
	set.add(new Person2("����һ",18));
	set.add(new Person2("����",56));
	set.add(new Person2("��������",33));
	set.add(new Person2("С��",67));
	System.out.println(set);//[Person2 [name=����, age=56], Person2 [name=С��, age=67], Person2 [name=����һ, age=18], Person2 [name=��������, age=33]]
}
}
