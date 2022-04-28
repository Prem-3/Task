package com.atmach;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;

public class TransactionEvent implements ApplicationListener<Withdrawal>{
	private ApplicationEventPublisher publisher;

    public void ApplicationEventPublisher(ApplicationEventPublisher publisher) {
    	System.out.println("Inside publisher");
        this.publisher = publisher;
    }

    public void publish(double amt,BankAccount acc) {
        Withdrawal event = new Withdrawal(this,amt,acc);
        this.publisher.publishEvent(event);
    }

	@Override
	public void onApplicationEvent(Withdrawal arg0) {
		// TODO Auto-generated method stub
		
	}
}
