package com.lieqihezi.countzero.listener;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class TestListener implements ApplicationListener<ApplicationStartingEvent> {

	public void onApplicationEvent(ApplicationStartingEvent arg0) {
		System.out.println("Springboot启动前执行这段代码");
		
	}


}
