package com.huangxi.map;

import java.util.Map;
import java.util.TreeMap;


/*�ϸ���˵Map�����Ǽ��ϣ�������������֮���ӳ���ϵ��Map��û�м̳���Collection�ӿڣ���������һ������ӿڣ�
 * Ȼ����ΪMap���Դ洢���ݣ�ÿ�δ洢��Ӧ�ô洢A������һ��Ԫ��(key)��B������һ��Ԫ��(value)�������ǻ���ϰ�߰�MapҲ��֮Ϊ����
 * key���ϲ������ظ���Set���ϣ��������һ��null
 * value���������ظ���List���ϣ�������null
 * Entry��key-value��Map�ɶ����ͬ��Entry��ɣ��Ѷ��Entry����һ�����ϣ���ʵ����Set<Entry>----->Map
 * Map�Ƕ����ֵ�ԣ�Entry���ļ���
 * ��ΪMapû�м̳�collection�ӿڣ�Ҳû�м̳�Iterable�ӿڣ����Բ���ֱ�Ӷ�Mapʹ��foreach����
 * */


/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!
 * Map�ĳ���ʵ���ࣺ
 * HashMap�����ù�ϣ���㷨����ʱMap�е�key���ᱣ֤��ӵ��Ⱥ�˳��keyҲ�������ظ�
 * 			key�ж��ظ��ı�׼�ǣ�key1��key2��hashCode�Ƿ���ȣ�����equals�Ƿ�true
 * TreeMap�����ú�����㷨����ʱMap�е�key�ᰴ����Ȼ˳����߶��������������keyҲ�������ظ�
 * 			key�ж��ظ��ı�׼�ǣ�compareTo/compare�ķ����Ƿ�Ϊ0
 * 			ʵ��NavigableMap<E>�ӿڣ�NavigableMap<E>�ӿڼ̳�SortedMap�ӿ�
 * LinkedHashMap������ ����͹�ϣ���㷨����ʱMap�е�key�ᱣ֤�Ⱥ����˳��key�������ظ�
 * 				key�ж��ظ��ı�׼��HashMap�е�key��׼��ͬ
 * Hashtable��Dictionary�����࣬���ù�ϣ���㷨����HashMap��ǰ��������Vetor����ArrayList��ǰ��
 *			���еķ�����ʹ��synchronized���η������̰߳�ȫ�ģ��������������HashMap�ϵ�
 * Properties��Map��ʵ���࣬Hashtable�����࣬��ʱҪ��key��value����String����
 * 				����������Դ�ļ���IO��
 * */

/*���ܷ�����
 * HashMap��TreeMap��LinkedHashMap�����̲߳���ȫ�ģ��������ܽϸ�
 * Map map=Collections.synchronizedMap(Map����)
 * ��ϣ���㷨������ֵ��ѯ���
 * ���ṹ������Χ��ѯ��죨Ӧ���������ϣ�
 * ʹ�ù����Setһ��
 * Hashtable�������ã���Vectorһ��
 * */



/* ʵ�ַ�����
 * void clear() 
          �Ӵ�ӳ�����Ƴ�����ӳ���ϵ����ѡ�������� 
 boolean containsKey(Object key) 
          �����ӳ�����ָ������ӳ���ϵ���򷵻� true�� 
 boolean containsValue(Object value) 
          �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true�� 
 Set<Map.Entry<K,V>> entrySet() 
          ���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ�� 
 boolean equals(Object o) 
          �Ƚ�ָ���Ķ������ӳ���Ƿ���ȡ� 
 V get(Object key) 
          ����ָ������ӳ���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null�� 
 int hashCode() 
          ���ش�ӳ��Ĺ�ϣ��ֵ�� 
 boolean isEmpty() 
          �����ӳ��δ������-ֵӳ���ϵ���򷵻� true�� 
 Set<K> keySet() 
          ���ش�ӳ���а����ļ��� Set ��ͼ�� 
 V put(K key, V value) 
          ��ָ����ֵ���ӳ���е�ָ������������ѡ�������� 
 void putAll(Map<? extends K,? extends V> m) 
          ��ָ��ӳ���н�����ӳ���ϵ���Ƶ���ӳ���У���ѡ�������� 
 V remove(Object key) 
          �������һ������ӳ���ϵ������Ӵ�ӳ�����Ƴ�����ѡ�������� 
 int size() 
          ���ش�ӳ���еļ�-ֵӳ���ϵ���� 
 Collection<V> values() 
          ���ش�ӳ���а�����ֵ�� Collection ��ͼ�� 
  

 * */
public class MapDemo {
	//���䰸��������һ���ַ�����ÿһ���ַ������ֵĴ���
public static void main(String[] args) {
	String str="dajbfbslhsgasdhasfygfahdfjeebcbas";
	//���ַ���ת��Ϊchar���飨�ַ������ʾ���char���飩
	char[] arr=str.toCharArray();
	Map<Character, Integer> map=new TreeMap<>();

	for (char c : arr) {
		if(map.containsKey(c)){
			Integer value=map.get(c);
			map.put(c, value+1);
		}else{
			map.put(c, 1);
		}
	}
	//�����Լ�����Ҫѡ�ò�ͬ��Map����������
	System.out.println(map);//{a=5, b=4, c=1, d=3, e=2, f=4, g=2, h=3, j=2, l=1, s=5, y=1}
}
}
