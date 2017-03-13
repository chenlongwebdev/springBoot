package com.wisely.highlight_spring4.ch1.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		SingletonDemo singletonDemo1 = context.getBean(SingletonDemo.class);
		SingletonDemo singletonDemo2 = context.getBean(SingletonDemo.class);
		PrototypeDemo prototypeDemo1 = context.getBean(PrototypeDemo.class);
		PrototypeDemo prototypeDemo2 = context.getBean(PrototypeDemo.class);
		System.out.println(singletonDemo1.equals(singletonDemo2));
		System.out.println(prototypeDemo1.equals(prototypeDemo2));
		context.close();
	}
}
