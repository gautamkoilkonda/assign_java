package com.capg8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Lab8_1 {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:/source.txt");
		FileOutputStream fos = new FileOutputStream("d:/target.txt");
		CopyDataThread copyFileThread = new CopyDataThread(fis, fos);
		copyFileThread.start();
	}

}
