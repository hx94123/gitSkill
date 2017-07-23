package com.huangxi.collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections类是真正意义上集合的工具类，封装了Set、List、Map的操作的工具方法
 * 面试题：Collection和Collections的区别：前者是集合的顶层接口，后者是集合的工具类
 * 
 *  static List EMPTY_LIST 
          空的列表（不可变的）。 
	static Map EMPTY_MAP 
          空的映射（不可变的）。 
	static Set EMPTY_SET 
          空的 set（不可变的）。
           
    static <T> List<T> emptyList() 
          返回空的列表（不可变的）。 
	static <K,V> Map<K,V> emptyMap() 
          返回空的映射（不可变的）。 
	static <T> Set<T> emptySet() 
          返回空的 set（不可变的）。 
          
	static <T> boolean addAll(Collection<? super T> c, T... elements) 
          将所有指定元素添加到指定 collection 中。 

	
          
    static <T> Collection<T> synchronizedCollection(Collection<T> c) 
          返回指定 collection 支持的同步（线程安全的）collection。 
	static <T> List<T> synchronizedList(List<T> list) 
          返回指定列表支持的同步（线程安全的）列表。 
	static <K,V> Map<K,V> synchronizedMap(Map<K,V> m) 
          返回由指定映射支持的同步（线程安全的）映射。 
	static <T> Set<T> synchronizedSet(Set<T> s) 
          返回指定 set 支持的同步（线程安全的）set。 

      举例： List list = Collections.synchronizedList(new ArrayList());
      ...
      //迭代时必须使用，因为涉及到两个线程
  	synchronized(list) {
      Iterator i = list.iterator(); // Must be in synchronized block
      while (i.hasNext())
          foo(i.next());
  }


 * */
public class CollectionsDemo {
public static void main(String[] args) {
	//返回空集
	List<Object> list=Collections.EMPTY_LIST;//常量
	List<Object> list2=Collections.emptyList();//方式最好
	List<Object> list3=new ArrayList<>();//java7以后，默认为空
}
}
