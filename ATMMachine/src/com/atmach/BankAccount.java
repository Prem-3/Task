package com.atmach;

public abstract class BankAccount {
	private long accNum;
	private String accHolder;
	private double accBalance;
	
	
	 public BankAccount(long accNum, String accHolder, double accBalance) {
		super();
		this.accNum = accNum;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}
	void showBalance() {
		System.out.println("Balance:"+this.accBalance);
	}
	abstract double withdraw(double amount);
	abstract double deposit(double amount);

public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}


@Override
public String toString() {
	return "BankAccount [accNum=" + accNum + ", accHolder=" + accHolder + ", accBalance=" + accBalance + "]";
}
}

