package Spring_AOP.NewSampleSpringAOPproject.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Spring_AOP.NewSampleSpringAOPproject.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext("EmployeeConfig.class");
Employee eobj=ac.getBean(Employee.class);
System.out.println(eobj.getName());
ac.close();
	}

}
