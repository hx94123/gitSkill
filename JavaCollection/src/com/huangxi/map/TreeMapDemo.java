package com.huangxi.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	Map<String, Object> map=new TreeMap<>();
	map.put("C", "CValue");
	map.put("A", "AValue");
	map.put("B", "BValue");
	map.put("E", "EValue");
	System.out.println(map);//{A=AValue, B=BValue, C=CValue, E=EValue}
}
}
