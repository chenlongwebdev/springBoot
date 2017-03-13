package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ContextConfig.class);
		FunctionService functionService = context.getBean(FunctionService.class);
		functionService.sayHello();
		functionService.sayBye();
		context.close();
	}
}
