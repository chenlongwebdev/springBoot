package com.wisely.highlight_spring4.ch2.profile;

/**
 * 
 * @author chenlong1
 *
 */
public class DemoBean {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public DemoBean(String content) {
		super();
		this.content = content;
	}
	
}