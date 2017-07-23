package com.huangxi.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDemo {
	/*Stack��ĵײ�ʵ���Ǽ̳�Vctor��ģ�������
	 * Deque �ӿڼ���ʵ���ṩ�� LIFO ��ջ�����ĸ������͸�һ�µ� set��Ӧ������ʹ�ô� set�����Ǵ��ࡣ
	 * ���磺 Deque<Integer> stack = new ArrayDeque<Integer>();*/
	public static void main(String[] args) {
		//ע�⣺��������Stack���������ջ�ף����ұ���ջ����Deque�෴
		Stack stack2 = new Stack();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		System.out.println(stack2);//[1, 2, 3]
		System.out.println(stack2.peek());//3
		stack2.pop();
		System.out.println(stack2);//[1, 2]
		
		System.out.println("---------------------");
		
		Deque<Integer> stack1 = new ArrayDeque<>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		System.out.println(stack1);//[3, 2, 1]
		System.out.println(stack1.peek());//3
		stack1.pop();
		System.out.println(stack1);//[2, 1]
	}
}
