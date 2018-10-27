package com.capgemini;

import java.util.Random;

public class Lab6_2 {

	public static void main(String[] args) throws ageException {

		Person person1 = new Person("smith", 39);

		Person person2 = new Person("kathy", 20);

		Account smith = new SavingsAccount();

		Account kathy = new SavingsAccount();

		Random random = new Random();

		smith.setAccNum(Math.abs(random.nextLong()));

		smith.setAccHolder(person1);

		kathy.setAccNum(Math.abs(random.nextLong()));

		kathy.setAccHolder(person2);

		System.out.println(smith.toString());

		System.out.println(kathy.toString());

		Account sa1 = new SavingsAccount();

		Account sa2 = new SavingsAccount();

		sa1.setAccHolder(person1);

		sa2.setAccHolder(person2);

		sa1.setBalance(2000);

		System.out.println("smith initial balance is:" + sa1.getBalance());

		System.out.println("withdrwaing 500 from smith savings account.............");

		sa1.withdraw(500);

		sa2.setBalance(3000);

		System.out.println("kathy initial balance is:" + sa2.getBalance());

		System.out.println("withdrwaing 2500 from kathy savings account.............");

		sa2.withdraw(2500);

		System.out.println("balance of kathy after withdraw in savings account:" + sa2.getBalance());

		System.out.println("balance of smith after withdraw in savings account:" + sa1.getBalance());

		Person person3 = new Person("banu", 14);

		if (person3.getAge() < 15)

			throw new ageException();

	}
}

class ageException extends Exception

{

	public String getmessage() {

		{

			System.out.println("Age of person should be above 15");

			return "Age of person should be above 15";

		}

	}

}
