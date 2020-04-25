package com.jhy.mvc;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.ServletRequestHandledEvent;

/**
 * 类名称  ： ServletRequestHandledevent
 * 描述说明：
 * 创建时间： 2020/3/29 5:13 下午
 *
 * @author ： jianghongyi
 */
@Component
public class ServletRequestHandledEventListener implements ApplicationListener<ServletRequestHandledEvent> {

	/**
	 * Handle an application event.
	 *
	 * @param event the event to respond to
	 */
	@Override
	public void onApplicationEvent(ServletRequestHandledEvent event) {
//		System.out.println("666"+event.getDescription());
	}
}
