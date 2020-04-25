package com.jhy.mvc;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 类名称  ： ControllerTerst3
 * 描述说明：
 * 创建时间： 2020/4/10 1:35 下午
 *
 * @author ： jianghongyi
 */
@Component(value = "/*")
public class ControllerTest3 implements Controller {

	@Override
	public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		System.out.println("ControllerTest3");
		return null;
	}
}
