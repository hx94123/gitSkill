package com.huangxi.summary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*List��Set��Map��ѡ��ȡ����ÿһ�������Ĵ洢�ص��Լ���ǰҵ�������
 * List����һԪ�ؼ���
 * 		����Ԫ���ظ�/��¼Ԫ�ص����˳��
 * Set����һԪ�ؼ���
 * 		������Ԫ���ظ�/����¼Ԫ�ص����˳��
 * 		������ظ�����Ҫ��֤�Ⱥ�˳��LinkedHashSet
 * Map��˫Ԫ�ؼ��ϡ�����洢���ݵ�ʱ�򣬻��ø�����Ψһ�����ƣ���ʱ����Map
 * 		Map���Ժ����õķǳ��㷺��������Ա�ʾJavaBean���󣬿��������棨�����䣩
 * 		JavaBean���󣺶�ԣ�������=����ֵ
 * 		Map����ÿһ��key-value�ͺñ���һ��������=����ֵ
 * 		��Map����ת��ΪJavaBean���󣬰�JavaBean����ת��ΪMap����
 * Set��List��Map���߲�����һֱ����ʹ�õģ�ż��Ҳ���ۺ�ʹ��
 * 
 * 
 * */
public class SummaryDemo {
public static void main(String[] args) {
	//List��Set֮���໥ת������
	List<String> list=new ArrayList<>();
	//��Listת��ΪSet�����ù���������ʱ����List���ظ���Ԫ�أ�������Ǹ���
	Set<String> set=new HashSet<>(list);
	//��Setת��ΪList��ͬ��
	List<String> list2=new ArrayList<>(set);
	//Map����ֱ��ת��ΪList���� Set������Map�еķ������Լ��ת���� 
	
	//ʹ��Set���ϴ洢ѧ��������
	Set<String> names1=new HashSet<>();
	names1.add("��һ");
	names1.add("����");
	names1.add("����");
	Set<String> names2=new HashSet<>();
	names2.add("С��");
	names2.add("С��");
	names2.add("С��");
	
	//ʹ��Map���洢����༶��ѧ����key�����洢�༶���ƣ�value�����洢������������������������
	//ѧԺA
	Map<String, Set<String>> classMap1 = new HashMap<>();
	classMap1.put("ѧǰ��", names1);
	classMap1.put("�����", names2);
	System.out.println(classMap1);//{�����=[С��, С��, С��], ѧǰ��=[��һ, ����, ����]}
	//ѧԺB
	Map<String, Set<String>> classMap2 = new HashMap<>();
	classMap2.put("ѧǰ��", names1);
	classMap2.put("�����", names2);
	//ʹ��List���洢����ѧԱ��ѧ������
	List<Map<String, Set<String>>> school=new ArrayList<>();
	school.add(classMap1);
	school.add(classMap2);
	System.out.println(school);//[{�����=[С��, С��, С��], ѧǰ��=[��һ, ����, ����]}, {�����=[С��, С��, С��], ѧǰ��=[��һ, ����, ����]}]

	List<Map<String, Object>> list3=new ArrayList<>();//�Ժ������õúܶ࣡����������

}
}
