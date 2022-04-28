package com.lifecycleofbean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		      HelloIndia obj = (HelloIndia) context.getBean("helloIndia");
		      obj.getMessage();
		      //context.registerShutdownHook();
		   }
}
