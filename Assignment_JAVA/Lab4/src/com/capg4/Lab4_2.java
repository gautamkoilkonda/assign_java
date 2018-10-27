

package com.capg4;



import java.util.Random;

 

public class Lab4_2 {

 

public static void main(String[] args) {

Person person1=new Person("smith",39);

Person person2=new Person("kathy",20);

Account smith = new SavingsAccount();

Account kathy = new SavingsAccount();

Random random=new Random();

smith.setAccNum(Math.abs(random.nextLong()));



smith.setAccHolder(person1);

kathy.setAccNum(Math.abs(random.nextLong()));


kathy.setAccHolder(person2);
System.out.println(smith.toString());
System.out.println(kathy.toString());
Account sa1= new SavingsAccount();
Account sa2= new SavingsAccount();
sa1.setAccHolder(person1);
sa2.setAccHolder(person2);


sa1.setBalance(2000);
System.out.println("smith initial balance is:"+sa1.getBalance());
 System.out.println("withdrawing 500from smith savings account");
 sa1.withdraw(500);



sa2.setBalance(3000);

System.out.println("kathy updated balance is:"+sa2.getBalance());
System.out.println("withdrawing 2500from kathy savings account");
sa2.withdraw(2500);
 
System.out.println("balance of kathy after withdraw in savings account:"+sa2.getBalance());
System.out.println("balance of smith after withdraw in savings account:"+sa1.getBalance());

}

 

}