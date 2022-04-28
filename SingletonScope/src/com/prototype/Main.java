package com.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practicescopes.HelloWorld;

public class Main {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
	      HelloWorld objA = (HelloWorld) context.getBean("helloPrem");

	      objA.getMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloPrem");

	      objB.setMessage("I'm object B");
	      objB.getMessage();
	      
	   }
	}
	