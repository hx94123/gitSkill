package com.huangxi.set;

import java.util.NavigableSet;
/*Set�ӿڵ�ʵ���ࣺ
 * ��ͬ���ص㣺 (1)��������Ԫ���ظ�
 * 			  (2)�������̰߳�ȫ��  Set s=Collections.syschronizedSet(Set����);
 * HashSet:�ײ�ʹ�õ��ǹ�ϣ���㷨����ѯЧ�ʼ��ߣ�
 * 			����֤Ԫ�ص��Ⱥ�����˳�򣡣���
 			�ж����������Ƿ���ȵĹ��򣺣�1��hashcodeֵ��ͬ
 									��2��equals�Ƚ�Ϊtrue
 * 			Ҫ��Ҫ����ڹ�ϣ���еĶ��󶼵ø���equals��hashCode����
 * LinkedHashSet��HashSet�����࣬�ײ�Ҳ���õ��ǹ�ϣ���㷨������Ҳʹ���������㷨��ά��Ԫ�ص��Ⱥ�����˳��
 * 				�ж����������Ƿ���ȵĹ����HashSet��ͬ
 * 				��Ϊ��Ҫ��ʹ��һ��������¼Ԫ�ص�����˳���������������HashSet�ϵ�
 * 				һ�����ã����Ҫ��һ�����ϼ�Ҫ��֤Ԫ�ز��ظ�����Ҫ��֤Ԫ������˳�򣬲�ʹ��LinkedHashSet
 * TreeSet��ʵ��NavigableSet<E>�ӿڣ�NavigableSet<E>�ӿڼ̳�SortedSet�ӿ�
 * 			����֤Ԫ�ص��Ⱥ�����˳�򣬵��ǻ�Լ����е�Ԫ�����������
 * 			�ײ�ʹ�ú�����㷨�����ṹ���Ƚ��ó�����Χ��ѯ��
 * 			TreeSetҪôʹ����Ȼ����Ҫôʹ�ö�������
 * 				��Ȼ����Ҫ����TreeSet�����еĶ������ʵ��Comparable�ӿڣ�������compareTo����
 * 				��������Ҫ���ڹ���TreeSet�����ʱ�򣬴���һ���Ƚ������󣨱Ƚ�������ʵ��Comparator�ӿڣ����ڱȽ����и���compare����������д�ȽϹ���
 * 			TreeSet�ж�Ԫ�ض����ظ��Ĺ���
 * 				compareTo/compare�����Ƿ񷵻�0������0����ͬһ������
 * 			ע�⣺HashSet��ͬ�����Ǻ���ĸ���ǰ��ģ�TreeSet�򲻸���
 * 
 * ע��
 * HashSet����ֵ��ѯЧ�ʸߣ�TreeSet����Χ��ѯЧ�ʸ�
 * �����Ǹ���������������ֵ��ѯ�������ݿ������������Χ��ѯ�϶࣬�������ṹ��Ҫ������������������߲�ѯЧ��
 * �������ʹ��HashSet���Ȳ����ѷ�Χ��ѯʹ��TreeSet
 * */	

public class SetDemo {

}