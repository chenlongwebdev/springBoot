package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5438509281731189446L;
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public DemoEvent(Object source,String msg) {
		super(source);
		this.msg=msg;
	}
}
