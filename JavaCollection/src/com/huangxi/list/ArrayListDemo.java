package com.huangxi.list;

import java.util.ArrayList;
import java.util.Collections;

/*Vector:���еķ�����ʹ����synchronized���η����̰߳�ȫ�������ܽϵͣ������ڶ��̻߳���
 * ArrayList:���еķ�����û��ʹ��synchronized���η����̲߳���ȫ�������ܽϸߡ�
 * ��ʹ�Ժ��ڶ��̻߳����£�����Ҳ��ʹ��Vector�ࣺList list=Collections.syschronizedList(new ArrayList(...));list���̰߳�ȫ��
 *ArrayList�Ĳ���������Vector�ķ�������һģһ����������ʾ
 * 
 * */
public class ArrayListDemo {
	
	
	/*ArrayList��Vector��Դ������е��
	 * ArrayList�еķ�����Ҫ����һ��ArrayList�����ڸ÷��������һ����û��ѯ�������ǲ��᷵��null������ ����һ���ռ�
	 */
	public ArrayList getAll(){
		//TODO
		//return new ArrayList();java7֮ǰ����ʹһ��Ԫ�ض����洢�����ڶѿռ���Ȼ��ʼ���˳���Ϊ10��Object����
		//java7��ʼ�Ż�������⣬��ʼ�ڹ�������Ĭ�ϴ���һ�������飬�ڵ�һ�ε���add������Ż��ʼ��
		return (ArrayList) Collections.emptyList();//��õķ�ʽ��
	}
}
