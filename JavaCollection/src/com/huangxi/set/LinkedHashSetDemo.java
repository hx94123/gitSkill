package com.huangxi.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*需求：不允许元素重复，但是需要保证先后添加的顺序
 * LinkedHashSet:底层使用哈希表和链表算法
 * 				哈希表：保证唯一性
 * 				链表：来记录元素的先后添加顺序
 * */
public class LinkedHashSetDemo {
public static void main(String[] args) {
	Set<String> set =new HashSet<>();
	set.add("A");
	set.add("B");
	set.add("C");
	set.add("D");
	System.out.println(set);//[D, A, B, C]
	
	Set<String> set1 =new LinkedHashSet<>();
	set1.add("A");
	set1.add("B");
	set1.add("C");
	set1.add("D");
	System.out.println(set1);//[A, B, C, D]
}
}
