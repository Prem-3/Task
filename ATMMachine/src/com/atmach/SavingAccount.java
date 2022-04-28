package com.atmach;

public class SavingAccount extends BankAccount {

	public SavingAccount(long accNum, String accHolder, double accBalance) {
		super(accNum, accHolder, accBalance);
		// TODO Auto-generated constructor stub
	}
	 public double withdraw(double amount) {
	        if (amount < 30000) {
	            if (getAccBalance() < amount) {
	                System.out.println("insufficiant amt");
	                return getAccBalance();
	            } else {
	                double amtRemain = getAccBalance() - amount;
	                setAccBalance(amtRemain);
	                return amtRemain;
	            }
	        } else {
	            System.out.println("withdraw imit exceeded ");
	            return getAccBalance();
	        }
	    }
	 public double deposit(double amt) {
	        if (amt <= 1000000) {
	            double newAmt = getAccBalance() + amt;
	            setAccBalance(newAmt);
	            return newAmt;
	        } else {
	            System.out.println("Deposit limit exceeded");
	            return getAccBalance();
	        }
	 }
}
