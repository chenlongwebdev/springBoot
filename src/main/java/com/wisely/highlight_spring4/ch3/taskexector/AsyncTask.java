package com.wisely.highlight_spring4.ch3.taskexector;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTask {
	@Async
	public void rocketLaunch(int i){
		System.out.println("神州"+i+"号火箭升空了");
	}
}
