package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 主要用来配置不同生产环境下的参数
 * @author chenlong1
 *
 */
@Configuration
public class ProfileConfig {
	@Bean
	@Profile("dev")
	public DemoBean demoBeanDev(){
		return new DemoBean("develop environment");
	}
	@Bean
	@Profile("prod")
	public DemoBean demoBeanProd(){
		return new DemoBean("product environment");
	}
}
