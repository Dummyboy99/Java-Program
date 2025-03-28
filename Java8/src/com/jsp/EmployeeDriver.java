package com.jsp;

import java.util.Arrays;
import java.util.function.Predicate;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1=new Employee("Naresh",39,10000);
		Employee e2=new Employee("santosh",28,20000);
		Employee e3=new Employee("Rohan",22,25000);
		Employee e4=new Employee("harshek",47,32000);
		Employee e5=new Employee("Jeet",39,22000);
		Employee e6=new Employee("Amit",20,18000);
		
	    Employee [] e= {e1,e2,e3,e4,e5,e6};
	    Arrays.sort(e);
	    
	    Predicate<Employee> p=i->i.age%2==0;
		for(Employee emp:e) {
			if(p.test(emp)) 
				System.out.println(emp);
		}
	}

	    
	}

