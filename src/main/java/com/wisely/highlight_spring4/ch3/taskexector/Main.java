package com.wisely.highlight_spring4.ch3.taskexector;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.register(AsyncTackExectorConfig.class);
		context.refresh();
		AsyncTask bean = context.getBean(AsyncTask.class);
		for (int i = 0; i < 100; i++) {
			bean.rocketLaunch(i);
		}
		context.close();
	}
}
