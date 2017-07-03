package annotationbasedconfigurationdemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext ac=new ClassPathXmlApplicationContext("annotationbasedconfigurationdemos/config2.xml");
     Employee obj1=(Employee)ac.getBean("employee");
     System.out.println(obj1);
     
	}
	

}
