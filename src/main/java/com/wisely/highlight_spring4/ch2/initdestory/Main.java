package com.wisely.highlight_spring4.ch2.initdestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		//如果使用class方式获取bean必须保证这个类型的bean唯一
		BeanConfig bean = (BeanConfig)context.getBean("aa");
		JSR250 bean2 = context.getBean(JSR250.class);
		context.close();//调用context后创建的bean的生命周期结束
	}

}
