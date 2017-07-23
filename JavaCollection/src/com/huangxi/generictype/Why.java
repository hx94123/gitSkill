package com.huangxi.generictype;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Why {
public static void main(String[] args) {
	
	//问题1:现在需要操作Integer中的方法，必须强转
	List list=new ArrayList();
	list.add(1);//Integer类型
	Object ele=list.get(0);
	Integer num=(Integer) ele;
	
	//问题2：约束存储到集合中的元素必修是相同的数据类型，相同的数据类型才能作比较，如TreeSet
	/*TreeSet set=new TreeSet();
	set.add(123);
	set.add("ABC");
	异常！
	*/
	
	//问题3：重复定义
	
}
}
