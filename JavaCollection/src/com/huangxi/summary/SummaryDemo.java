package com.huangxi.summary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*List、Set、Map的选用取决于每一种容器的存储特点以及当前业务的需求
 * List：单一元素集合
 * 		允许元素重复/记录元素的添加顺序
 * Set：单一元素集合
 * 		不允许元素重复/不记录元素的添加顺序
 * 		如果不重复，又要保证先后顺序：LinkedHashSet
 * Map：双元素集合。如果存储数据的时候，还得给数据唯一的名称，此时考虑Map
 * 		Map在以后运用的非常广泛，比如可以表示JavaBean对象，可以做缓存（工具箱）
 * 		JavaBean对象：多对，属性名=属性值
 * 		Map对象：每一个key-value就好比是一对属性名=属性值
 * 		把Map对象转换为JavaBean对象，把JavaBean对象转换为Map对象
 * Set、List、Map三者并不是一直单独使用的，偶尔也会综合使用
 * 
 * 
 * */
public class SummaryDemo {
public static void main(String[] args) {
	//List与Set之间相互转换问题
	List<String> list=new ArrayList<>();
	//把List转换为Set，利用构造器，此时消除List中重复的元素（后面的那个）
	Set<String> set=new HashSet<>(list);
	//把Set转换为List，同理
	List<String> list2=new ArrayList<>(set);
	//Map不能直接转化为List或者 Set（但是Map中的方法可以间接转化） 
	
	//使用Set集合存储学生的名称
	Set<String> names1=new HashSet<>();
	names1.add("赵一");
	names1.add("张三");
	names1.add("李四");
	Set<String> names2=new HashSet<>();
	names2.add("小明");
	names2.add("小红");
	names2.add("小方");
	
	//使用Map来存储多个班级的学生，key用来存储班级名称，value用来存储姓名！！！！！！！！！！
	//学院A
	Map<String, Set<String>> classMap1 = new HashMap<>();
	classMap1.put("学前班", names1);
	classMap1.put("大神班", names2);
	System.out.println(classMap1);//{大神班=[小方, 小明, 小红], 学前班=[赵一, 张三, 李四]}
	//学院B
	Map<String, Set<String>> classMap2 = new HashMap<>();
	classMap2.put("学前班", names1);
	classMap2.put("大神班", names2);
	//使用List来存储所有学员的学生姓名
	List<Map<String, Set<String>>> school=new ArrayList<>();
	school.add(classMap1);
	school.add(classMap2);
	System.out.println(school);//[{大神班=[小方, 小明, 小红], 学前班=[赵一, 张三, 李四]}, {大神班=[小方, 小明, 小红], 学前班=[赵一, 张三, 李四]}]

	List<Map<String, Object>> list3=new ArrayList<>();//以后这种用得很多！！！！！！

}
}
