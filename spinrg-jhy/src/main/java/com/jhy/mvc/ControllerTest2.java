package com.jhy.mvc;

import com.jhy.spring.Father;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 类名称  ： ControllerTest2
 * 描述说明：
 * 创建时间： 2020/4/7 7:29 下午
 *
 * @author ： jianghongyi
 */
@Controller
public class ControllerTest2 {

	@Autowired
	private Father son;

	@RequestMapping("/test2")
	public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		System.out.println(son);
		return null;
	}
}
