package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class Presentation {

	static int id[]= {1001,1002,1003,1005};
	static String name[]= {"ram kumar","p kumar","raman kumar","shaam kumar"};
	static int salary[]= {19000,4000,50000,30000};
	static String designation[]= {"System Associate","Clerk","Manager","Programmer"};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee emp[]=new Employee[4];
		EmployeeServiceImpl service=new EmployeeServiceImpl();
		for(int i=0;i<emp.length;i++) {
			
			emp[i]=new Employee(id[i],name[i],salary[i],designation[i]);
			service.getDetails(emp[i]);
		}
                        service.displayDetails(1003);
		System.out.println("Insurance scheme is"+service.findInsurance(1003));
		
	}

}
