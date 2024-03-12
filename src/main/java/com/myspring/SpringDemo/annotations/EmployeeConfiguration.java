package com.myspring.SpringDemo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfiguration {
	
	@Bean(name="emp1")
	public Employee getEmp()
	{
		Employee e1 = new Employee();
		e1.setEmpid(1);
		e1.setEmpname("James");
		e1.setSalary(90000);
		return e1;
	}

	@Bean(name="emp2")
	public Employee getEmp1()
	{
		Employee e=new Employee();
		e.setEmpid(2);
		e.setEmpname("Jorden");
		e.setSalary(3423432)
		;
		return e;
	}
	@Bean(name="dept1")
	public Department getDept1()
	{
		Department d=new Department();
		d.setDeptcode(101);
		d.setDeptname("HR");
		d.setCity("Mumbai");
		return d;
	}
}
