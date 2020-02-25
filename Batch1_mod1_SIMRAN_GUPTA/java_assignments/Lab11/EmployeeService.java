package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	public void getDetails(Employee emp);
	public String getScheme(float salary,String designation );
	public void displayDetails(int id);
	
	
}
