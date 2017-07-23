package com.huangxi.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*Set与Map的关系：
 * 拿HashSet与HashMap来说：
 * 看两个类的源码发现：HashMap的底层是一个Entry类型的数组，而HashSet的底层则是操作HashMap
 *
 *如在HashSet中有：private transient HashMap<E,Object> map;
  public HashSet() {
    map = new HashMap<>();
   }
  public boolean add(E e) {
    return map.put(e, PRESENT)==null;
   }
   PRESENT是一个常量
  public boolean remove(Object o) {
      return map.remove(o)==PRESENT;
  }
  
  TreeSet与TreeMap
  LinkedHashMap与LinkedHashMap都是如此
  结论：相同算法的Set底层用的是相同算法的Map，把Set集合对象作为Map的key，再使用一个Object常量作为value
 * 因此，Map中的key其实就是一个Set集合
 * ！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 * */
public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();//一般情况下key用String，value用Object
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		//key相同则覆盖
		System.out.println(map);//{key4=value4, key3=value3, key5=value5, key2=value2, key1=value1}
		//map.clear(); {}
		System.out.println(map.containsKey("key1"));//true
		System.out.println(map.containsValue("value"));//false
		System.out.println(map.get("key1"));//value1
		System.out.println(map.size());//5
		map.remove("key2");
		System.out.println(map);//{key4=value4, key3=value3, key5=value5, key1=value1}
		
		//可以根据key获得value，但是不可以根据value获得key，因为key不允许重复，value允许重复
		//获取Map中所有key组成的集合，类似于Set
		Set<String> keys=map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		/*key4
		key3
		key5
		key1*/
		
		//获取Map中所有value组成的集合，类似于List，实际使用Collection接收
		Collection<Object> values=map.values();
		for (Object object : values) {
			System.out.println(object);
		}
		/*value4
		value3
		value5
		value1*/
		
		//获取Map中所有的Entry(key-value),类似于Set
		Set<Map.Entry<String, Object>> entrys=map.entrySet();//静态内部接口
		for (Map.Entry<String, Object> entry : entrys) {
			String key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+"-->"+value);
			/*key4-->value4
			  key3-->value3
			  key5-->value5
		 	  key1-->value1*/
		}
		
	}
}
