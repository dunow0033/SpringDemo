package com.myspring.SpringDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("beans.xml");
        Student s = (Student) appcont.getBean("student2");
        System.out.println("Student name is " + s.getStudentname());
        College c = (College)appcont.getBean("college1");
        System.out.println("College code is " + c.getCollegecode());
        System.out.println("College name is " + c.getCollegename());
        Student s1 = c.getStudent();
        System.out.println("Student name inside college is " + s1.getStudentname());
        
        Employee e = (Employee) appcont.getBean("emp1");
        System.out.println("Employee name is " + e.getEmpname());
        Department d = (Department) appcont.getBean("dept1");
        System.out.println("Department code is " + d.getDeptcode());
        System.out.println("Department name is " + d.getDeptname());
        Employee e1 = d.getEmp();
        System.out.println("Employee name inside department is " + e1.getEmpname());
    }
}