package com.springdemo;


import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
		Student std=(Student) context.getBean("studentbean");
		System.out.println(std);
	}

}
