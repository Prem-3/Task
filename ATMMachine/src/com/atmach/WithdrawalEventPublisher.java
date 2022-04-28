package com.atmach;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class WithdrawalEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
    	System.out.println("Inside publisher");
        this.publisher = publisher;
    }

    public void publish(double amt,BankAccount acc) {
        Withdrawal event = new Withdrawal(this,amt,acc);
        this.publisher.publishEvent(event);
    }
}
