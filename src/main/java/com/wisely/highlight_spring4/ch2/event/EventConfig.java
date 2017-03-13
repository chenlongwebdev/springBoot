package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {
	@Bean
	public DemoListener demoListener(){
		return new DemoListener();
	}
	@Bean
	public DemoPublisher demoPublisher(){
		DemoPublisher demoPublisher = new DemoPublisher();
		return demoPublisher;
	}
}
