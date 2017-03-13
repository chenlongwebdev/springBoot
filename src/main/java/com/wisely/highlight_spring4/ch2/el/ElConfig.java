package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@PropertySource("classpath:com\\wisely\\highlight_spring4\\ch2\\el\\test.properties")
@Service
public class ElConfig {
	@Value("chenlong")
	private String normal;
	@Value("#{systemProperties['os.name']}")
	private String osName;
	@Value("#{T(java.lang.Math).random()*10000}")
	private double randomNumber;
	@Value("#{demoService.getName()}")//访问name?
	private String name;
	@Value("classpath:com\\wisely\\highlight_spring4\\ch2\\el\\test.txt")
	private Resource testFile;
	@Value("http://www.baidu.com")
	private Resource testUrl;
	@Value("${nier.name}")
	private String bookName;
	@Autowired
	private Environment environment;
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	public void outputResource(){
		try {
			
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(name);
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("nier.name"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
