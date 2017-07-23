package com.huangxi.collectionUtil;


import java.util.Arrays;
import java.util.List;

/*在Collection接口中有一个方法叫做toArray把集合转换为Object数组
 * 把集合转换为数组：Object[] arr=集合对象.toAarray();
 * 
 * 数组也可以转换为集合（只能是List集合）:Arrays类中有一个asList方法
 * */
public class ArraysDemo {
public static void main(String[] args) {
	//把数组转换为List对象
	List<String> list=Arrays.asList("A","B","C","D");
	System.out.println(list);//[A, B, C, D]
	//list.remove(0);  报异常：java.lang.UnsupportedOperationException
	//原因：Aarrays的asList方法返回的是固定大小的列表，不能增加，也不能减少，可以修改！！！！！
	list.set(0, "E");
	//asList方法返回的对象不是java.util.ArrayList而是Arrays类中内部类对象
	
	//可以自动装箱
	List<Integer> list2=Arrays.asList(1,2,3,4,5);
	//定义了int类型的数组
	int[] arr={1,2,3,4,5};
	//直接把数组当成对象,List类型不能是Integer
	List<int[]> list3=Arrays.asList(arr);
}
}
