package com.huangxi.list;

import java.util.LinkedList;

/*LinkedList是双向链表，单向队列，双向队列和栈的实现
 *LinkedList类实现单向队列和双向队列的接口，自身提高了栈操作的方法，链表操作的方法
 *
 *详情见Deque API的总结！！！！！！！！！！！！！！！！！！！！！！
 * 			第一个元素（头部）				     最后一个元素（尾部） 
 		    抛出异常               特殊值 		           抛出异常          	特殊值 
插入 	addFirst(e)   offerFirst(e) 	addLast(e) 	 offerLast(e) 
移除 	removeFirst() pollFirst() 		removeLast() pollLast() 
检查 	getFirst()    peekFirst() 		getLast()	 peekLast() 

Queue方法 	 等效 Deque方法 
add(e) 		addLast(e) 
offer(e) 	offerLast(e) 
remove() 	removeFirst() 
poll() 		pollFirst() 
element() 	getFirst() 
peek() 		peekFirst() 

堆栈方法 		等效 Deque方法 
push(e)		addFirst(e) 
pop() 		removeFirst() 
peek() 		peekFirst() 

 *LinkedList类是线程不安全的，List list=Collections.syschronizedList(new LinkedList(...));
 * */
public class LinkedListDemo {
	/*无论是链表还是队列，都特别擅长操作头和尾的节点
	 * 在LinkedList中绝大多数方法都是xxFirst(),xxLast();
	 * LinkedList没有索引的概念，但是Object get(int index)表示索引位置获取对应的元素，
	 * 没办法，只好在LinkedList内部提供了一个变量来当索引，该方法要少用，因为LinkedList不擅长做查询操作
	 * */
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("A");//等同于addLast("A")
		list.addLast("B");
		list.addLast("C");
		System.out.println(list);
	}
}
