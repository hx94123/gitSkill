package com.huangxi.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Iterator操作。注：ListIterator是双向的，有hasPrevious()、previous()方法向前迭代
public class IteratorDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		// 方式1：for循环
		for (int i = 0; i < list.size(); i++) {
			Object ele = list.get(i);
			System.out.println(ele);
		}
		// 方式2：for-each
		for (Object ele : list) {
			System.out.println(ele);
		}
		// 方式3：迭代器，循环结束it依然存在
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 方式4：使用for循环操作迭代器，性能更好，操作完后释放资源！！！！！！！！！！！
		for (Iterator it2 = list.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
	}
}
