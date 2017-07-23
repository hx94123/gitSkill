package com.huangxi.map;

import java.util.Map;
import java.util.TreeMap;


/*严格上说Map并不是集合，而是两个集合之间的映射关系（Map并没有继承于Collection接口，它本身是一个顶层接口）
 * 然而因为Map可以存储数据（每次存储都应该存储A集合中一个元素(key)，B集合中一个元素(value)），我们还是习惯把Map也称之为集合
 * key集合不允许重复：Set集合，最多允许一个null
 * value集合允许重复：List集合，允许多个null
 * Entry：key-value，Map由多个不同的Entry组成，把多个Entry看成一个集合，其实就是Set<Entry>----->Map
 * Map是多个键值对（Entry）的集合
 * 因为Map没有继承collection接口，也没有继承Iterable接口，所以不能直接对Map使用foreach操作
 * */


/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Map的常用实现类：
 * HashMap：采用哈希表算法，此时Map中的key不会保证添加的先后顺序，key也不允许重复
 * 			key判断重复的标准是：key1和key2的hashCode是否相等，而且equals是否true
 * TreeMap：采用红黑树算法，此时Map中的key会按照自然顺序或者定制排序进行排序，key也不允许重复
 * 			key判断重复的标准是：compareTo/compare的返回是否为0
 * 			实现NavigableMap<E>接口，NavigableMap<E>接口继承SortedMap接口
 * LinkedHashMap：采用 链表和哈希表算法，此时Map中的key会保证先后添加顺序，key不允许重复
 * 				key判断重复的标准和HashMap中的key标准相同
 * Hashtable：Dictionary的子类，采用哈希表算法，是HashMap的前身（类似于Vetor类是ArrayList的前身）
 *			所有的方法都使用synchronized修饰符，是线程安全的，但是性能相对于HashMap较低
 * Properties：Map的实现类，Hashtable的子类，此时要求key和value都是String类型
 * 				用来加载资源文件（IO）
 * */

/*性能分析：
 * HashMap、TreeMap、LinkedHashMap都是线程不安全的，但是性能较高
 * Map map=Collections.synchronizedMap(Map对象)
 * 哈希表算法：做等值查询最快
 * 树结构：做范围查询最快（应用在索引上）
 * 使用规则和Set一样
 * Hashtable打死不用，和Vector一样
 * */



/* 实现方法：
 * void clear() 
          从此映射中移除所有映射关系（可选操作）。 
 boolean containsKey(Object key) 
          如果此映射包含指定键的映射关系，则返回 true。 
 boolean containsValue(Object value) 
          如果此映射将一个或多个键映射到指定值，则返回 true。 
 Set<Map.Entry<K,V>> entrySet() 
          返回此映射中包含的映射关系的 Set 视图。 
 boolean equals(Object o) 
          比较指定的对象与此映射是否相等。 
 V get(Object key) 
          返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。 
 int hashCode() 
          返回此映射的哈希码值。 
 boolean isEmpty() 
          如果此映射未包含键-值映射关系，则返回 true。 
 Set<K> keySet() 
          返回此映射中包含的键的 Set 视图。 
 V put(K key, V value) 
          将指定的值与此映射中的指定键关联（可选操作）。 
 void putAll(Map<? extends K,? extends V> m) 
          从指定映射中将所有映射关系复制到此映射中（可选操作）。 
 V remove(Object key) 
          如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。 
 int size() 
          返回此映射中的键-值映射关系数。 
 Collection<V> values() 
          返回此映射中包含的值的 Collection 视图。 
  

 * */
public class MapDemo {
	//经典案例：计算一个字符串中每一个字符串出现的次数
public static void main(String[] args) {
	String str="dajbfbslhsgasdhasfygfahdfjeebcbas";
	//把字符串转化为char数组（字符串本质就是char数组）
	char[] arr=str.toCharArray();
	Map<Character, Integer> map=new TreeMap<>();

	for (char c : arr) {
		if(map.containsKey(c)){
			Integer value=map.get(c);
			map.put(c, value+1);
		}else{
			map.put(c, 1);
		}
	}
	//根据自己的需要选用不同的Map来决定排序
	System.out.println(map);//{a=5, b=4, c=1, d=3, e=2, f=4, g=2, h=3, j=2, l=1, s=5, y=1}
}
}
