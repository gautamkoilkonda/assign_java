package com.capgemini.eis.exception6;

public class Employee implements EmployeeService {

	public int EmpId;

	public String EmpName;

	public double Salary;

	public String Designation;

	public String InsuranceScheme;

	public Employee(int EmpId, String EmpName, float Salary, String Designation)

	{

		this.EmpId = EmpId;

		this.EmpName = EmpName;

		this.Salary = Salary;

		this.Designation = Designation;

	}

	public void CheckInsuranceScheme() {

	}

	public String getEmpId() {	
		return null;
	}

}
