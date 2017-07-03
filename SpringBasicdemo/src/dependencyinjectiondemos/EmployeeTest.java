package dependencyinjectiondemos;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext ac=new ClassPathXmlApplicationContext("dependencyinjectiondemos/config.xml");
     Employee obj1=(Employee)ac.getBean("bean1");
     System.out.println(obj1);
     Employee obj2=(Employee)ac.getBean("bean2");
     System.out.println(obj2);
     Employee obj3=(Employee)ac.getBean("bean3");
     System.out.println(obj3);
     Employee obj4=(Employee)ac.getBean("bean4");
     System.out.println(obj4);
     Employee obj5=(Employee)ac.getBean("bean5");
     System.out.println(obj5);
     Employee obj6=(Employee)ac.getBean("bean1");
     System.out.println(obj1);
     System.out.println("Address of all the object created");
     System.out.println("Bean1-obj1 using singleton scope"+ obj1.hashCode());
     System.out.println("Bean1-obj6 using singleton scope"+ obj6.hashCode());
     System.out.println("Bean5 using prototype scope"+ obj5.hashCode());
	}
	

}
