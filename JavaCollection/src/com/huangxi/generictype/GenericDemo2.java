package com.huangxi.generictype;

import java.util.ArrayList;
import java.util.List;

/*���͵Ĳ��������ͱ����ڼ�ᱻ���� (�����Զ�����)
���Ѵ��з��͵ļ��ϸ��������з��͵ļ���ʱ����ʱ���ͱ�����*/
public class GenericDemo2 {
public static void main(String[] args) {
	List<Integer> list1=new ArrayList<>();
	list1.add(123);
	//list1.add("abc");���ʹ���
	List list2=null;
	list2=list1;
	list2.add("abc");//��ȷ������û�����͵�listʱ�����ͱ�����
	
	/*����Ⱦ���棡������
	 * ��һ��������ʹ�÷���Ҳʹ�ÿɱ����ʱ,��ʱ���׵��¶���Ⱦ����
	 * ����Arrays���е�asList����
	 *   @SafeVarargs ���ƾ��棨�������ˣ�
    	public static <T> List<T> asList(T... a) {
        	return new ArrayList<>(a);
    	}
    	...��ʾ��ѡ��������
	 * */
	List<String> list3=null;
	//list3=list1;����
	list3=list2;//��Ȼ���벻����
	//String num=list3.get(0);�������з����쳣����Ϊlist3�ı��ʳ���Integer�ȼ���String num=123;����
}
}
