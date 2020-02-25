package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	Employee emp;
	HashMap<Integer,Employee> emp1;
	
	public EmployeeServiceImpl() {
		emp1=new HashMap<>();
	}

	
	@Override
	public String getScheme(float salary, String designation) {
		for(int key: emp1.keySet())
		{
			Employee emp2=emp1.get(key);
		  if(emp2.getDesignation().equals(designation) && emp2.getSalary()==salary)
			  return emp2.getInsuranceScheme();
			
		}
		return null;
	}
	
	
	@Override
	public void displayDetails(int id) {
		// TODO Auto-generated method stub
		Employee employee=emp1.get(id);
		System.out.println("Employee details");
		System.out.println(employee);
	}
	@Override
	public void getDetails(Employee emp) {
		// TODO Auto-generated method stub
		emp1.put(emp.getId(), emp);
	}


	public String findInsurance(int id) {
		// TODO Auto-generated method stub
		Employee emp3=emp1.get(id);
		return emp3.getInsuranceScheme();
		//return null;
	}

	

	
	
}
	

