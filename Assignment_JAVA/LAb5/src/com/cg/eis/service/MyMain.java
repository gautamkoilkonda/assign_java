package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		int id = sc.nextInt();
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Salary:");
		double sal = sc.nextDouble();
		Employee e = new Employee(id, name, id, name);
		e.setEmpId(id);
		e.setEmpName(name);
		e.setSalary(sal);
		if(sal < 5000) {
			e.setDesignation("clerk");
			e.setInsuranceScheme("No Scheme");
		}else if(sal > 5000 && sal < 20000){
			e.setDesignation("system associate");
			e.setInsuranceScheme("Scheme C");
			
		}else if(sal >= 20000 && sal < 40000){
			e.setDesignation("programmer");
			e.setInsuranceScheme("Scheme B");
			
		}else if(sal >= 40000){
			e.setDesignation("Manager");
			e.setInsuranceScheme("Scheme A");
			
		}

	}

}
