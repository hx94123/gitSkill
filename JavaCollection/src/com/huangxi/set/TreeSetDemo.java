package com.huangxi.set;

import java.util.TreeSet;
/*TreeSet集合底层采用红黑树算法，会对存储的元素默认使用自然排序（从小到大）
 * 范围查询！
 * 注意：必须保证TreeSet中的元素类型是相同的
 * */
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add("A");
		//set.add(1);在定义时特意没有加类型，但是运行报异常，因为TreeSet会将元素进行排序，不是同类型不能排序
		System.out.println(set);
		
		TreeSet<String> set2=new TreeSet();
		set2.add("A");
		set2.add("D");
		set2.add("B");
		set2.add("A");
		set2.add("2"); 
		set2.add("1");
		System.out.println(set2);//[1, 2, A, B, D]按码表排序
		//注意！！！！！疑问：这样不就是Set有序了吗 ？不是的，我们所谓的Set无序是指不记录元素的添加顺序！！！
		
		//SortedTree接口中的方法
		System.out.println(set2.first());//1
		System.out.println(set2.last());//D
		System.out.println(set2.tailSet("B"));//[B, D]
		
		//NavigableSet接口中的方法
		System.out.println(set2.headSet("B"));//[1, 2, A] 严格小于B
		
		
		
	
	}
	
}
