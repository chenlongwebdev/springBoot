package com.wisely.highlight_spring4.ch1.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService bean = context.getBean(UseFunctionService.class);
		bean.sayHello("fuck lin");
		context.close();
	}

}
