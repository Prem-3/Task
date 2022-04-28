package com.javaannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	 public static void main(String[] args) {
	      @SuppressWarnings("resource")
		ApplicationContext ctx = 
	         new AnnotationConfigApplicationContext(HelloWorldConfig.class);
	   
	      HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
	      helloWorld.setMessage("Hello Prem!");
	      helloWorld.getMessage();
	   }
	}