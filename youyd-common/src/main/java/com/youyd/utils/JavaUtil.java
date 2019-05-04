package com.youyd.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * java原生 工具类
 * @author LGG
 * @create 2019年4月20日22:35:18
 * @version 1.0.0
 */
public class JavaUtil {

	/**
	 * 获取该类和所有父类的全部字段
	 * @param object 对象
	 */
	public static List<String> getAllFields(Object object){
		ArrayList<String> arrayList = new ArrayList<>();
		// 获取所有的字段
		List<Field> fieldList = new ArrayList<>() ;
		Class tempClass = object.getClass();
		while (tempClass != null && tempClass.getName().getClass() instanceof java.lang.Object) {
			fieldList.addAll(Arrays.asList(tempClass.getDeclaredFields()));
			tempClass = tempClass.getSuperclass();
		}
		for (Field objField : fieldList) {
			objField.setAccessible(true);
			String name = objField.getName();
			arrayList.add(name);
		}
		return arrayList;
	}
}
