package com.springdemo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class EventHandler implements ApplicationListener<ContextRefreshedEvent>{
		public void onApplicationEvent(ContextRefreshedEvent eventHandler) {
			System.out.println("Context Refreshed at:: "+System.currentTimeMillis());
		}
	}


