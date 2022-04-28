package com.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
	    ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      
	      context.start();
		  
	      HelloIndia obj = (HelloIndia) context.getBean("helloIndia");
	      
	      obj.getMessage();
	     
	      context.stop();
	   }
}
