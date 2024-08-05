package com.model;

public class EmployeeModel {
	private int employeeId;
	private String name;
	private int salary;
	
	
	public EmployeeModel(int id, String n, int s) {
		employeeId = id;
		name = n;
		salary = s;
		
	}

	public int getEmployeeID(){
		return employeeId;
	}
	public String getEmployeeName(){
		return name;
	}
	public int getEmployeeSalary(){
		return salary;
	}
	
	public void setEmployeeID(int empId){
		employeeId = empId;
	}
	public void setEmployeeName(String eName){
		name = eName;
	}
	public void setEmployeeSalary(int esalary){
		salary = esalary;
	}
}
