package com.atmach;

import org.springframework.context.ApplicationEvent;

public class Withdrawal extends ApplicationEvent {
double amount;
BankAccount acc;
public Withdrawal(Object source, double amount, BankAccount acc) {
	super(source);
	this.amount = amount;
	this.acc = acc;
}
	
}
