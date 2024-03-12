package com.myspring.SpringDemo.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class Department {
	
	@Qualifier("emp1")
	@Autowired
	private Employee emp;
	
	@Autowired
	private List<Employee> emplist;
	
	private int deptcode;
	
	private String deptname;
	
	private String city;
	
	public int getDeptcode() {
		return deptcode;
	}
	
	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Employee> getEmp() {
		return emplist;
	}
	public void setEmp(List<Employee> emp) {
		this.emplist = emp;
	}
}
