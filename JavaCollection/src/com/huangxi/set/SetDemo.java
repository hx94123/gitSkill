package com.huangxi.set;

import java.util.NavigableSet;
/*Set接口的实现类：
 * 共同的特点： (1)都不允许元素重复
 * 			  (2)都不是线程安全的  Set s=Collections.syschronizedSet(Set对象);
 * HashSet:底层使用的是哈希表算法，查询效率极高；
 * 			不保证元素的先后添加顺序！！！
 			判断两个对象是否相等的规则：（1）hashcode值相同
 									（2）equals比较为true
 * 			要求：要求存在哈希表中的对象都得覆盖equals和hashCode方法
 * LinkedHashSet：HashSet的子类，底层也采用的是哈希表算法，但是也使用了链表算法来维持元素的先后添加顺序
 * 				判断两个对象是否相等的规则和HashSet相同
 * 				因为需要多使用一个链表记录元素的添加顺序，所以性能相对于HashSet较低
 * 				一般少用，如果要求一个集合既要保证元素不重复，又要保证元素添加顺序，才使用LinkedHashSet
 * TreeSet：实现NavigableSet<E>接口，NavigableSet<E>接口继承SortedSet接口
 * 			不保证元素的先后添加顺序，但是会对集合中的元素做排序操作
 * 			底层使用红黑树算法（树结构，比较擅长做范围查询）
 * 			TreeSet要么使用自然排序，要么使用定制排序
 * 				自然排序：要求在TreeSet集合中的对象必须实现Comparable接口，并覆盖compareTo方法
 * 				定制排序：要求在构建TreeSet对象的时候，传入一个比较器对象（比较器必须实现Comparator接口），在比较器中覆盖compare方法，并编写比较规则
 * 			TreeSet判断元素对象重复的规则：
 * 				compareTo/compare方法是否返回0，返回0则是同一个对象
 * 			注意：HashSet相同对象是后面的覆盖前面的，TreeSet则不覆盖
 * 
 * 注：
 * HashSet做等值查询效率高，TreeSet做范围查询效率高
 * 而我们更多的情况都是做等值查询，在数据库的索引中做范围查询较多，所以树结构主要用来做索引，用来提高查询效率
 * 绝大多数使用HashSet，迫不得已范围查询使用TreeSet
 * */	

public class SetDemo {

}
