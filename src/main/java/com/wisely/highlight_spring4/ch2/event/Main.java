package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(EventConfig.class);
		context.refresh();
		DemoPublisher bean = context.getBean(DemoPublisher.class);
		bean.publishDemoEvent();
		context.close();
	}
}
