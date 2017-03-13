package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationListener;
public class DemoListener implements ApplicationListener<DemoEvent> {
	@Override
	public void onApplicationEvent(DemoEvent event) {
		System.out.println("监听到msg为"+event.getMsg()+"的event");
	}
}
