package sampleaop.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sampleaop.config.EmployeeConfig;

public class EmployeeMain {
	public static void main(String args[]){
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp=ac.getBean(Employee.class);
		Address adr=ac.getBean(Address.class);
		emp.setAddress(adr);
		emp.display();
	}
}
