package com.wisely.highlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		ElConfig elConfig = context.getBean(ElConfig.class);
		elConfig.outputResource();
		context.close();
	}

}
