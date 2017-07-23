package com.huangxi.generictype;

import java.util.ArrayList;
import java.util.List;

/*泛型的擦除：泛型编译期间会被擦除 (泛型自动擦除)
当把带有泛型的集合赋给不带有泛型的集合时，此时泛型被擦除*/
public class GenericDemo2 {
public static void main(String[] args) {
	List<Integer> list1=new ArrayList<>();
	list1.add(123);
	//list1.add("abc");类型错误
	List list2=null;
	list2=list1;
	list2.add("abc");//正确，赋给没有类型的list时，泛型被擦除
	
	/*堆污染警告！！！！
	 * 当一个方法既使用泛型也使用可变参数时,此时容易导致堆污染问题
	 * 如在Arrays类中的asList方法
	 *   @SafeVarargs 抑制警告（自欺欺人）
    	public static <T> List<T> asList(T... a) {
        	return new ArrayList<>(a);
    	}
    	...表示可选参数数组
	 * */
	List<String> list3=null;
	//list3=list1;错误
	list3=list2;//虽然编译不报错
	//String num=list3.get(0);但是运行发生异常，因为list3的本质成了Integer等价于String num=123;错误
}
}
