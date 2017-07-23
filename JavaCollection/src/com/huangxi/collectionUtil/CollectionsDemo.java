package com.huangxi.collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections�������������ϼ��ϵĹ����࣬��װ��Set��List��Map�Ĳ����Ĺ��߷���
 * �����⣺Collection��Collections������ǰ���Ǽ��ϵĶ���ӿڣ������Ǽ��ϵĹ�����
 * 
 *  static List EMPTY_LIST 
          �յ��б����ɱ�ģ��� 
	static Map EMPTY_MAP 
          �յ�ӳ�䣨���ɱ�ģ��� 
	static Set EMPTY_SET 
          �յ� set�����ɱ�ģ���
           
    static <T> List<T> emptyList() 
          ���ؿյ��б����ɱ�ģ��� 
	static <K,V> Map<K,V> emptyMap() 
          ���ؿյ�ӳ�䣨���ɱ�ģ��� 
	static <T> Set<T> emptySet() 
          ���ؿյ� set�����ɱ�ģ��� 
          
	static <T> boolean addAll(Collection<? super T> c, T... elements) 
          ������ָ��Ԫ����ӵ�ָ�� collection �С� 

	
          
    static <T> Collection<T> synchronizedCollection(Collection<T> c) 
          ����ָ�� collection ֧�ֵ�ͬ�����̰߳�ȫ�ģ�collection�� 
	static <T> List<T> synchronizedList(List<T> list) 
          ����ָ���б�֧�ֵ�ͬ�����̰߳�ȫ�ģ��б� 
	static <K,V> Map<K,V> synchronizedMap(Map<K,V> m) 
          ������ָ��ӳ��֧�ֵ�ͬ�����̰߳�ȫ�ģ�ӳ�䡣 
	static <T> Set<T> synchronizedSet(Set<T> s) 
          ����ָ�� set ֧�ֵ�ͬ�����̰߳�ȫ�ģ�set�� 

      ������ List list = Collections.synchronizedList(new ArrayList());
      ...
      //����ʱ����ʹ�ã���Ϊ�漰�������߳�
  	synchronized(list) {
      Iterator i = list.iterator(); // Must be in synchronized block
      while (i.hasNext())
          foo(i.next());
  }


 * */
public class CollectionsDemo {
public static void main(String[] args) {
	//���ؿռ�
	List<Object> list=Collections.EMPTY_LIST;//����
	List<Object> list2=Collections.emptyList();//��ʽ���
	List<Object> list3=new ArrayList<>();//java7�Ժ�Ĭ��Ϊ��
}
}
