package com.jhy.spring;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;

/**
 * 类名称  ： User
 * 描述说明：
 * 创建时间： 2020/3/29 11:37 下午
 *
 * @author ： jianghongyi
 */
@Component
public class User {
	private String userName;

	public User() {
	}

	public User(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static void main(String[] args) {
		User user = new User("123");

		BeanWrapper beanWrapper = new BeanWrapperImpl(user);
		beanWrapper.setPropertyValue("userName","jhy");
		System.out.println(user.getUserName());

	}
}
