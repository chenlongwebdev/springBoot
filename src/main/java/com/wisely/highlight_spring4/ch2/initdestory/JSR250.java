package com.wisely.highlight_spring4.ch2.initdestory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 * 使用jsr250方式配置生命周期
 * postconstruction predestory
 * @author chenlong1
 *
 */
public class JSR250 {
	public JSR250(){
		System.out.println("创建对象JSR250");
	}
	@PostConstruct
	public  void init(){
		System.out.println("JSR250 的初始化方法");
	}
	@PreDestroy
	public  void destory(){
		System.out.println("JSR250 的销毁方法");
	}
}
