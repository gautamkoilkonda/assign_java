package com.capg4;

public class SavingsAccount extends Account {
final double min_balance = 500;
public SavingsAccount() {}
@Override
public void withdraw(double amt) {
	if((balance-amt)>=min_balance) {
		balance -= amt;
		System.out.println("withdraw is successfully completed");
	}
	else
		System.out.println("withdraw is cancelled due to insufficient balance.You should maintain min_balance of 500");
}
}
