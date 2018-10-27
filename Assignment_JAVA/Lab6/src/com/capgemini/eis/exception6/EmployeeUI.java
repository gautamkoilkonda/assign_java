package com.capgemini.eis.exception6;

import java.util.Scanner;

public class EmployeeUI {
	public static void main(String[] args) {
		System.out.println("Enter Employee ID: \n");
		Scanner sc = new Scanner(System.in);
		int EmpId = sc.nextInt();
		System.out.println("Enter Employee name: \n");
		String EmpName = sc.next();
		System.out.println("Enter Employee salary \n");
		float Salary = sc.nextFloat();
		System.out.println("Enter Employee designation: \n");
		String Designation = sc.next();
		Employee emp = new Employee(EmpId, EmpName, Salary, Designation);
		emp.CheckInsuranceScheme();
		System.out.println("Employee Id:" + emp.getEmpId());
		System.out.println("Employee Name:" + emp.EmpName);
		System.out.println("Employee Salary:" + emp.Salary);
		System.out.println("Employee Designation:" + emp.Designation);
	}
}
