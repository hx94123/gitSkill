package com.huangxi.set;

import java.util.HashSet;
import java.util.Set;

/*一个不包含重复元素的 collection。更正式地说，set 不包含满足 
 *e1.equals(e2)的元素对 e1 和 e2，并且最多包含一个 null 元素
 * 
 * HashSet() 
      构造一个新的空 set，其底层 HashMap实例的默认初始容量是 16，加载因子是 0.75
   其底层也是一个数组，是为了提供查询速度，插入速度也比较快，但是适用于少量数据的插入操作
   
  注：判断是否为同一个对象 hashcode与equals
  当往HashSet集合中添加新的对象的时候，先会判断该对象和集合对象中的hashCode值：
  （1）不等：直接把该新的对象存储到hashCode指定的位置
  （2）相等：判断equals
  			1）true：则视为是同一个对象，则不保存在哈希表中
  			2）false：非常麻烦，存储在之前对象同槽位的链表上（拒绝，操作比较麻烦）
 */

public class HashSetDemo {
public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	set.add("A");
	set.add("B");
	set.add("C");
	set.add("D");
	//根据hashcode->hash算法->决定位置
	System.out.println(set);//[D, A, B, C] 无序
	set.add("C");
	System.out.println(set);//[D, A, B, C] 覆盖
	
	Set<String> set2=new HashSet<>();
	set2.add("1");
	set2.add("2");
	//set.add(set2);类型不对 错误
	set.addAll(set2);
	System.out.println(set);//[D, 2, 1, A, B, C]
	System.out.println(set.contains("2"));//true
	
	for (String ele : set) {
		System.out.println(ele);
		
	}
	//不同时遍历时可以使用Collection中的remove方法，遍历时不能使用foreach
	set.remove("2");

	
}
}
