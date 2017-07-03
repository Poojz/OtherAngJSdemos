package annotationbasedconfigurationdemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

public class EmployeeConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(EmployeeConfig.class);
 //AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext("EmployeeConfig.class");
 Emp eobj=ctx.getBean(Emp.class);
 System.out.println(eobj.getEmpid());
	}

}
