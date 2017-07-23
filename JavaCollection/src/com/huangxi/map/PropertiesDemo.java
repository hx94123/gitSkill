package com.huangxi.map;

import java.util.Properties;

//Map的实现类，Hashtable的子类，此时要求key和value都是String类型
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties p=new Properties();
		p.setProperty("username", "root");
		p.setProperty("password", "admin");
		System.out.println(p);//{password=admin, username=root}
		//根据key获取value
		System.out.println(p.getProperty("username"));//root 底层是get(key) 其实是强转
		System.out.println(p.getProperty("user", "111"));//111 该key不存在返回默认值
		
		//加载资源文件（IO）略
		
	}
}
