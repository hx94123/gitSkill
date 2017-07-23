package com.huangxi.list;

import java.util.ArrayList;
import java.util.Collections;

/*Vector:所有的方法都使用了synchronized修饰符。线程安全但是性能较低，适用于多线程环境
 * ArrayList:所有的方法都没有使用synchronized修饰符。线程不安全但是性能较高。
 * 即使以后在多线程环境下，我们也不使用Vector类：List list=Collections.syschronizedList(new ArrayList(...));list是线程安全的
 *ArrayList的操作方法与Vector的方法几乎一模一样，不做演示
 * 
 * */
public class ArrayListDemo {
	
	
	/*ArrayList和Vector的源码差异有点大
	 * ArrayList有的方法需要返回一个ArrayList对象，在该方法中如果一个都没查询到，我们不会返回null，而是 返回一个空集
	 */
	public ArrayList getAll(){
		//TODO
		//return new ArrayList();java7之前，即使一个元素都不存储，但在堆空间依然初始化了长度为10的Object数组
		//java7开始优化这个问题，开始在构造器中默认创建一个空数组，在第一次调用add方法后才会初始化
		return (ArrayList) Collections.emptyList();//最好的方式！
	}
}
