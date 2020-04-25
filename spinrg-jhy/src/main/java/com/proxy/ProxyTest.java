package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 类名称  ： ProxyTest
 * 描述说明：
 * 创建时间： 2020/2/8 11:53 上午
 *
 * @author ： jianghongyi
 */
public class ProxyTest {
	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		InvocationHandler handler=new UserProxyService(userService);
		UserService proxy= (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),userService.getClass().getInterfaces(),																										handler);
		proxy.doSomeThing();
	}
}
