package com.wisely.highlight_spring4.ch1.di;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class UseFunctionService {
	@Resource
	private FunctionService function;
	
	public void sayHello(String name){
		System.out.println(function.sayHello(name));
	}
}
