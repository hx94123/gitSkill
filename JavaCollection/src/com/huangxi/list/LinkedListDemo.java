package com.huangxi.list;

import java.util.LinkedList;

/*LinkedList��˫������������У�˫����к�ջ��ʵ��
 *LinkedList��ʵ�ֵ�����к�˫����еĽӿڣ����������ջ�����ķ�������������ķ���
 *
 *�����Deque API���ܽᣡ������������������������������������������
 * 			��һ��Ԫ�أ�ͷ����				     ���һ��Ԫ�أ�β���� 
 		    �׳��쳣               ����ֵ 		           �׳��쳣          	����ֵ 
���� 	addFirst(e)   offerFirst(e) 	addLast(e) 	 offerLast(e) 
�Ƴ� 	removeFirst() pollFirst() 		removeLast() pollLast() 
��� 	getFirst()    peekFirst() 		getLast()	 peekLast() 

Queue���� 	 ��Ч Deque���� 
add(e) 		addLast(e) 
offer(e) 	offerLast(e) 
remove() 	removeFirst() 
poll() 		pollFirst() 
element() 	getFirst() 
peek() 		peekFirst() 

��ջ���� 		��Ч Deque���� 
push(e)		addFirst(e) 
pop() 		removeFirst() 
peek() 		peekFirst() 

 *LinkedList�����̲߳���ȫ�ģ�List list=Collections.syschronizedList(new LinkedList(...));
 * */
public class LinkedListDemo {
	/*�����������Ƕ��У����ر��ó�����ͷ��β�Ľڵ�
	 * ��LinkedList�о��������������xxFirst(),xxLast();
	 * LinkedListû�������ĸ������Object get(int index)��ʾ����λ�û�ȡ��Ӧ��Ԫ�أ�
	 * û�취��ֻ����LinkedList�ڲ��ṩ��һ�����������������÷���Ҫ���ã���ΪLinkedList���ó�����ѯ����
	 * */
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("A");//��ͬ��addLast("A")
		list.addLast("B");
		list.addLast("C");
		System.out.println(list);
	}
}
