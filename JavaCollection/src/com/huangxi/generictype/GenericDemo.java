package com.huangxi.generictype;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
		//泛型类：直接在类/接口上定义的泛型
		List<String> list=new ArrayList<String>();//该list集合中只能存储String类型的元素
		//因为前后类型相同，从java7开始使用菱形语法<>
		List<String> list1=new ArrayList<>();
		/*泛型不存在继承的关系
		List<Object> list=new ArrayList<String>();错误！！！！！
		子类继承泛型类时指明泛型的类型
		从此以后，使用集合都得使用泛型来约束该集合中元素的类型，通过反编译发现，泛型的底层依然使用强转
		*/
	
		//泛型方法：在方法上声明泛型
		//情况1：泛型类中的泛型只能适用于非静态方法，如果需要给静态方法设置泛型，此时使用泛型方法
		//情况 2：泛型类中的泛型应该适用于整个类中的多个方法，有时只对某一个方法设置泛型即可
		int obj = doWork1(123);
		
		//不知道使用什么类型来接收泛型时，使用通配符 ? ，此时只能接收数据，而不能存储
		//List<?> list=new ArrayList<>();再调用add方法存储不可以
		List<String> list2=new ArrayList<>();
		doWork2(list2);
		List<Integer> list3=new ArrayList<>();
		doWork2(list3);
		
		//泛型的上限
		List<Number> list4=new ArrayList<>();
		doWork3(list4);//本身
		//泛型的下限
		List<Object> list5=new ArrayList<>();
		doWork4(list4);//本身
		doWork4(list5);//父类
		
		
		
	}
	//泛型方法一般通过参数传递来决定泛型的类型 <T>是声明
	public static<T> T doWork1(T val){
		return val;
	}
	
	public static void doWork2(List<?> list){
	}
	
	//此时的泛型?必须是Number类型或其子类
	public static void doWork3(List<? extends Number > list){
	}
	
	//此时的泛型?必须是Number类型或其父类
		public static void doWork4(List<? super Number > list){
		}

}
