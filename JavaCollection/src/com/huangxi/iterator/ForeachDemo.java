package com.huangxi.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*for(类型 变量 : 数组名或Iterable的实例) 
 * foreach操作数组，底层依然使用for循环加索引来获取元素
 * foreach操作Iterable的实例，底层使用的是for循环的Iterator迭代器
 * 注：Map不继承Iterable，故不能放在for-each循环中
 * Iterable表示可迭代的，是一种能力，Iterator表示迭代器，是一种事物
 * 
 * 故：直接使用foreach迭代数组和集合元素即可，简单
 * */
public class ForeachDemo {
	public static void main(String[] args) {
		//foreach操作数组
		int[] a = { 1, 2, 3 };
		for (int i : a) {
			System.out.println(i);
		}
		/*底层实现
		 * int ai[] = {};
		int k = (ai = a).length;
		for (int j = 0; j < k; j++) {
			int i = ai[j];
			System.out.println(i);
		}*/
		
		//foreach操作Iterable的实例
		List list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		for (Object ele : list) {
			System.out.println(ele);
		}
		/*底层实现
		 * Object ele;
		for (Iterator iterator = list.iterator(); iterator.hasNext();System.out.println(ele)) {
			ele=iterator.next();
		}*/
		
		//当需要边迭代集合元素，边删除指定的元素时，此时只能使用 迭代器实现，不能用 foreach
		/*for (Object ele : list) {
			//删除集合中的B
			if("B".equals(ele)){
				list.remove(ele);
			}
		异常：java.util.ConcurrentModificationException，并发修改异常
		当使用迭代器的时候，会在当前线程A中单独创建一个新的线程B
		A线程负责继续迭代，B线程负责去删除
		B线程每次都会去检查和A线程中的元素是否个数相同，如果不是，则报上述异常
		如何解决：不要使用集合对象的删除方法，在Collection接口中存在删除指定元素的方法boolean remove(Objece ele)
		该方法只能从集合中删除元素，不能把迭代器中指定的元素的也删除，用迭代器自己的删除方法！！！！！
		}*/
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object ele=iterator.next();
			if("B".equals(ele)){
				//list.remove(ele);错误！！！！！！
				iterator.remove();
			}
		}
		System.out.println(list);//[A, C, D]
	}
}
