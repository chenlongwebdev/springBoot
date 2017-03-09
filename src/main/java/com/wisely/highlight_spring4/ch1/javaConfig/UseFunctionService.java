package com.wisely.highlight_spring4.ch1.javaConfig;

public class UseFunctionService {
	private FunctionService functionService;

	public FunctionService getFunctionService() {
		return functionService;
	}

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public void sayHello(String name){
		functionService.sayHello(name);
	}

}
 