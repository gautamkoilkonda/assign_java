package com.capgemini;

public class Account {
	long accNum;
	double balance;
	Person accHolder;

	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}

	public Account() {
		super();
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void withdraw(double amt) {
		balance = balance - amt;
	};

	@Override

	public String toString() {

		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";

	}

}
