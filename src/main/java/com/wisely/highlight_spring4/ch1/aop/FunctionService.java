package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Component;

@Component
public class FunctionService {
	@Action(name="�g�p����I�����ؓ����@")
	public void sayHello(){
		System.out.println("hello");
	}
	public void sayBye(){
		System.out.println("bye");
	}

}
