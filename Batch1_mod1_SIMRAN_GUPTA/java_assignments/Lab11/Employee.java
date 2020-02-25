package com.cg.eis.bean;

import java.util.HashMap;


public class Employee {

	private int id;
	private String name;
	private float salary;
	private String designation;
	
	private String insuranceScheme;
	//HashMap<Integer,Employee> emp1;
	
	
	public Employee(int id, String name, float salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("System Associate")) {
			insuranceScheme="Scheme C";
		}
		else  if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("Programmer"))
			insuranceScheme="Scheme B";
		else if(salary>=40000 && designation.equalsIgnoreCase("Manager"))
			insuranceScheme="Scheme A";
		else if(salary<=5000 && designation.equalsIgnoreCase("clerk"))
			insuranceScheme="No scheme";
		
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	
	
	
}
