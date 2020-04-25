package com.jhy.mvc;

import com.jhy.spring.Father;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


import javax.annotation.Resource;


/**
 * 类名称  ： ControllerTest
 * 描述说明：
 * 创建时间： 2020/3/21 9:56 下午
 *
 * @author ： jianghongyi
 */
@Component(value = "/test/t1")
public class ControllerTest implements EnvironmentAware, Controller {

	@Override
	public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		System.out.println("ControllerTest");
		return null;
	}

	/**
	 * Set the {@code Environment} that this component runs in.
	 *
	 * @param environment
	 */
	@Override
	public void setEnvironment(Environment environment) {
		System.out.println(environment);
	}
}
