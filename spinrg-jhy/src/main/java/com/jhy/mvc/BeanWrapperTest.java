package com.jhy.mvc;

import com.jhy.spring.User;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 类名称  ： BeanWrapper
 * 描述说明：
 * 创建时间： 2020/4/7 8:06 下午
 *
 * @author ： jianghongyi
 */
public class BeanWrapperTest {
	public static void main(String[] args) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
		User user = new User("123");

		BeanWrapper beanWrapper=new BeanWrapperImpl(user);
		beanWrapper.setPropertyValue("userName","jhy1");
		System.out.println(user.getUserName());

//		Field[] fields = user.getClass().getDeclaredFields();
//		PropertyDescriptor pd = new PropertyDescriptor("userName", User.class);
//		Method method = pd.getWriteMethod();
//		method.setAccessible(true);
//		Object obj = method.invoke(user,"1234");
//		System.out.println(user.getUserName());
	}
}
