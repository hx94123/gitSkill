package com.huangxi.generictype;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Why {
public static void main(String[] args) {
	
	//����1:������Ҫ����Integer�еķ���������ǿת
	List list=new ArrayList();
	list.add(1);//Integer����
	Object ele=list.get(0);
	Integer num=(Integer) ele;
	
	//����2��Լ���洢�������е�Ԫ�ر�������ͬ���������ͣ���ͬ���������Ͳ������Ƚϣ���TreeSet
	/*TreeSet set=new TreeSet();
	set.add(123);
	set.add("ABC");
	�쳣��
	*/
	
	//����3���ظ�����
	
}
}
