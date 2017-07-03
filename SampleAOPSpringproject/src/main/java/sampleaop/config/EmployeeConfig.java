package sampleaop.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sampleaop.model.Address;
import sampleaop.model.Employee;

@Configuration
public class EmployeeConfig {

	@Bean
      Employee employee(){
		Employee e1=new Employee();
		e1.setEmpid(10001);
		e1.setEmpName("Pooja");
		e1.setRole("Computer Engineer");
	    return e1;	
	}
	 
	@Bean
	 Address address(){
		 Address a1=new Address();
		 a1.setCity("Pune");
		 a1.setPincode(234567);
		 return a1;
	 }
}
