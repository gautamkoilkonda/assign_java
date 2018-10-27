package com.capg4;

public class Account {

long accNum;

double balance;

long accHolder;

 

public Account(long accNum, double balance, Person accHolder) {

super();

this.accNum = accNum;

this.balance = balance;

this.accHolder = accHolder;

}

public Account() {

super();

}

public long getaccNum() {

return accNum;

}

public void setaccNum(long accNum) {

this.accNum = accNum;

}

public double getBalance() {

return balance;

}

public void setBalance(double balance) {

this.balance = balance;

}

public void deposit(double amt)

 

{

balance =balance+amt;

}

 


public Person getAccHolder() {

return accHolder;

}

public void setAccHolder(long l) {

this.accHolder = l;

}

 

public void withdraw(double amt)

{

balance=balance-amt;

};

 

@Override

public String toString() {

return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";

}

}