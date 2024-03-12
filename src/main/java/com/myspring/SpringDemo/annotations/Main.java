package com.myspring.SpringDemo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.*;

public class Main {
	
	public static void main(String[] args)
	{
      AnnotationConfigApplicationContext annotconfig=
				new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		Employee e=(Employee)annotconfig.getBean("emp2");
		System.out.println("Employee name is "+e.getEmpname());
		
		Department d=(Department) annotconfig.getBean("dept1");
		System.out.println("Department name "+d.getDeptname());
		List<Employee> emp= d.getEmp();
		
		for(Employee e1:emp)
		{
			System.out.println("Empoyee name in list "+e1.getEmpname());
		}
	}
}
