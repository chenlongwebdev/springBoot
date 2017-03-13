package com.wisely.highlight_spring4.ch2.event;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;

/**
 * 触发event
 * @author chenlong1
 *采用javaConfig方式管理对象
 */
public class DemoPublisher {
	@Resource//注入实例
	private ApplicationContext context;
	public void publishDemoEvent(){
		context.publishEvent(new DemoEvent(this, "XVIDEO 八门凯"));
	}
}
