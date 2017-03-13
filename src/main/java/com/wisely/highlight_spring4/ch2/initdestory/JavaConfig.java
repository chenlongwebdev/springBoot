package com.wisely.highlight_spring4.ch2.initdestory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean(initMethod="init",destroyMethod="destory",name={"aa","bb","cc"})
	public BeanConfig beanConfig(){
		return new BeanConfig();
	}
	@Bean(initMethod="init",destroyMethod="destory")
	public BeanConfig bean(){
		return new BeanConfig();
	}
	@Bean
	public JSR250 jSR250(){
		return new JSR250();
	}

}
