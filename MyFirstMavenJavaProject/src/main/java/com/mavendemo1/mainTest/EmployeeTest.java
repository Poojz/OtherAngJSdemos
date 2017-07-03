package com.mavendemo1.mainTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mavendemo1.config.EmployeeConfig;
import com.mavendemo1.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(EmployeeConfig.class);
 Employee emp=ac.getBean(Employee.class);
 System.out.println(emp);
	}

}
