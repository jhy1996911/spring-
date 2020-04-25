package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 类名称  ： UserProxyService
 * 描述说明：
 * 创建时间： 2020/2/8 11:56 上午
 *
 * @author ： jianghongyi
 */
public class UserProxyService implements InvocationHandler {

	Object object=null;

	public UserProxyService(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("前置代理");
		return method.invoke(object,args);
	}
}
