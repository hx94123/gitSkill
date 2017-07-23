package com.huangxi.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDemo {
	/*Stack类的底层实现是继承Vctor类的！！！！
	 * Deque 接口及其实现提供了 LIFO 堆栈操作的更完整和更一致的 set，应该优先使用此 set，而非此类。
	 * 例如： Deque<Integer> stack = new ArrayDeque<Integer>();*/
	public static void main(String[] args) {
		//注意：！！！！Stack类最左边是栈底，最右边是栈顶，Deque相反
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
