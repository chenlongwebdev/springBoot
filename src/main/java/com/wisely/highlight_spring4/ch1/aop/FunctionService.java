package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Component;

@Component
public class FunctionService {
	@Action(name="使用注解的方式切入方法")
	public void sayHello(){
		System.out.println("hello");
	}
	public void sayBye(){
		System.out.println("bye");
	}

}
