package com.huangxi.map;

import java.util.Properties;

//Map��ʵ���࣬Hashtable�����࣬��ʱҪ��key��value����String����
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p=new Properties();
		p.setProperty("username", "root");
		p.setProperty("password", "admin");
		System.out.println(p);//{password=admin, username=root}
		//����key��ȡvalue
		System.out.println(p.getProperty("username"));//root �ײ���get(key) ��ʵ��ǿת
		System.out.println(p.getProperty("user", "111"));//111 ��key�����ڷ���Ĭ��ֵ
		
		//������Դ�ļ���IO����
		
	}
}
