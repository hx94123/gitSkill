package com.huangxi.generictype;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
		//�����ֱࣺ������/�ӿ��϶���ķ���
		List<String> list=new ArrayList<String>();//��list������ֻ�ܴ洢String���͵�Ԫ��
		//��Ϊǰ��������ͬ����java7��ʼʹ�������﷨<>
		List<String> list1=new ArrayList<>();
		/*���Ͳ����ڼ̳еĹ�ϵ
		List<Object> list=new ArrayList<String>();���󣡣�������
		����̳з�����ʱָ�����͵�����
		�Ӵ��Ժ�ʹ�ü��϶���ʹ�÷�����Լ���ü�����Ԫ�ص����ͣ�ͨ�������뷢�֣����͵ĵײ���Ȼʹ��ǿת
		*/
	
		//���ͷ������ڷ�������������
		//���1���������еķ���ֻ�������ڷǾ�̬�����������Ҫ����̬�������÷��ͣ���ʱʹ�÷��ͷ���
		//��� 2���������еķ���Ӧ���������������еĶ����������ʱֻ��ĳһ���������÷��ͼ���
		int obj = doWork1(123);
		
		//��֪��ʹ��ʲô���������շ���ʱ��ʹ��ͨ��� ? ����ʱֻ�ܽ������ݣ������ܴ洢
		//List<?> list=new ArrayList<>();�ٵ���add�����洢������
		List<String> list2=new ArrayList<>();
		doWork2(list2);
		List<Integer> list3=new ArrayList<>();
		doWork2(list3);
		
		//���͵�����
		List<Number> list4=new ArrayList<>();
		doWork3(list4);//����
		//���͵�����
		List<Object> list5=new ArrayList<>();
		doWork4(list4);//����
		doWork4(list5);//����
		
		
		
	}
	//���ͷ���һ��ͨ�������������������͵����� <T>������
	public static<T> T doWork1(T val){
		return val;
	}
	
	public static void doWork2(List<?> list){
	}
	
	//��ʱ�ķ���?������Number���ͻ�������
	public static void doWork3(List<? extends Number > list){
	}
	
	//��ʱ�ķ���?������Number���ͻ��丸��
		public static void doWork4(List<? super Number > list){
		}

}
