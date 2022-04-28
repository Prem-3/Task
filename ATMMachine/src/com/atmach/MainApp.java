package com.atmach;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[]) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        BankAccount savingAcc=(SavingAccount)context.getBean("savingsAccount");
        WithdrawalEventPublisher publisher=(WithdrawalEventPublisher)context.getBean("withdrawalEventPublisher");
        savingAcc.withdraw(345);
        publisher.publish(345,savingAcc);
	}
}
