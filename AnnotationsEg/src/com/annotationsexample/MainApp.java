//package com.annotationsexample;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class MainApp {
//
//	public static void main(String[] args) {
//		      ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
//		      
//		      Student student = (Student) context.getBean("student");
//		      System.out.println("Name : " + student.getName() );
//		      System.out.println("Age : " + student.getAge() );
//		   }
//
//}


package com.annotationsexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		      ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		      
		      Profile profile = (Profile) context.getBean("profile");
		      profile.printAge();
		      profile.printName();
		      }
}
