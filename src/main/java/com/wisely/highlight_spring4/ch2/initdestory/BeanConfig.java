package com.wisely.highlight_spring4.ch2.initdestory;

/**
 * 使用bean配置方式管理生命周期
 * initmethod destorymethod
 * @author chenlong1
 *
 */

public class BeanConfig {
	public BeanConfig(){
		System.out.println("创建对象beanconfig");
	}
	public  void init(){
		System.out.println("beanconfig 的初始化方法");
	}
	
	public  void destory(){
		System.out.println("beanconfig 的销毁方法");
	}

}
