package com.capg8;

import java.util.LinkedList;
import java.util.Queue;

public class Lab8_4 {
	public static void main(String[] args) throws InterruptedException {
		Queue sharedQ = new LinkedList();
		final int MAX_SIZE = 5;
		Thread customer = new Thread(new CustomerThread(sharedQ, MAX_SIZE));
		Thread biller = new Thread(new BillerThread(sharedQ, MAX_SIZE));
		customer.start();
		biller.start();
	}

}
