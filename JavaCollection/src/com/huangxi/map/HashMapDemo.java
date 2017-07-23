package com.huangxi.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*Set��Map�Ĺ�ϵ��
 * ��HashSet��HashMap��˵��
 * ���������Դ�뷢�֣�HashMap�ĵײ���һ��Entry���͵����飬��HashSet�ĵײ����ǲ���HashMap
 *
 *����HashSet���У�private transient HashMap<E,Object> map;
  public HashSet() {
    map = new HashMap<>();
   }
  public boolean add(E e) {
    return map.put(e, PRESENT)==null;
   }
   PRESENT��һ������
  public boolean remove(Object o) {
      return map.remove(o)==PRESENT;
  }
  
  TreeSet��TreeMap
  LinkedHashMap��LinkedHashMap�������
  ���ۣ���ͬ�㷨��Set�ײ��õ�����ͬ�㷨��Map����Set���϶�����ΪMap��key����ʹ��һ��Object������Ϊvalue
 * ��ˣ�Map�е�key��ʵ����һ��Set����
 * ��������������������������������������������������������������������������
 * */
public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();//һ�������key��String��value��Object
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key4", "value4");
		map.put("key5", "value5");
		//key��ͬ�򸲸�
		System.out.println(map);//{key4=value4, key3=value3, key5=value5, key2=value2, key1=value1}
		//map.clear(); {}
		System.out.println(map.containsKey("key1"));//true
		System.out.println(map.containsValue("value"));//false
		System.out.println(map.get("key1"));//value1
		System.out.println(map.size());//5
		map.remove("key2");
		System.out.println(map);//{key4=value4, key3=value3, key5=value5, key1=value1}
		
		//���Ը���key���value�����ǲ����Ը���value���key����Ϊkey�������ظ���value�����ظ�
		//��ȡMap������key��ɵļ��ϣ�������Set
		Set<String> keys=map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
		/*key4
		key3
		key5
		key1*/
		
		//��ȡMap������value��ɵļ��ϣ�������List��ʵ��ʹ��Collection����
		Collection<Object> values=map.values();
		for (Object object : values) {
			System.out.println(object);
		}
		/*value4
		value3
		value5
		value1*/
		
		//��ȡMap�����е�Entry(key-value),������Set
		Set<Map.Entry<String, Object>> entrys=map.entrySet();//��̬�ڲ��ӿ�
		for (Map.Entry<String, Object> entry : entrys) {
			String key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+"-->"+value);
			/*key4-->value4
			  key3-->value3
			  key5-->value5
		 	  key1-->value1*/
		}
		
	}
}
