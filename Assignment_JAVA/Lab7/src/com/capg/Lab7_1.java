package com.capg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lab7_1 {
	public static int getSorted(int a[]) {
		int n = a.length;
		String[] rar = new String[n];
		for (int i = 0; i < n; i++) {
			rar[i] = String.valueOf(a[i]);
			StringBuilder ss = new StringBuilder();
			ss.append(rar[i]);
			ss = ss.reverse();
			rar[i] = ss.toString();
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(rar[i]);
			list.add(x);
		}
		Collections.sort(list);
		System.out.println(list);
		return 0;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] ar = new int[n1];
		for (int i = 0; i < n1; i++) {
			ar[i] = sc.nextInt();
		}
		getSorted(ar);
	}

}