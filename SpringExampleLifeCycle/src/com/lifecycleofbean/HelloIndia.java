package com.lifecycleofbean;

public class HelloIndia {
	private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	  
	   public void init(){
	      System.out.println("Bean is going through initialization.");
	   }
	   public void destroy() {
	      System.out.println("Bean will destroy now.");
	   }
	public void getMessage() {
		System.out.println("Your Message : " + message);
		
	}
	}

