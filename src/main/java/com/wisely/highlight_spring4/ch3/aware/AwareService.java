package com.wisely.highlight_spring4.ch3.aware;

import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {
	private ResourceLoader resourceLoader;
	private String beanName;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader=resourceLoader;
	}

	@Override
	public void setBeanName(String beanName) {
		this.beanName=beanName;
	}
	
	public void resourceOutput(){
		System.out.println("beanName:"+this.beanName);
		Resource resource = resourceLoader.getResource("classpath:com/wisely/highlight_spring4/ch3/aware/test.properties");
		try {
			System.out.println(IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
