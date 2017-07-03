package Spring_AOP.NewSampleSpringAOPproject.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Spring_AOP.NewSampleSpringAOPproject.model.Employee;

@Configuration
public class EmployeeConfig {

	@Bean
	Employee employee(){
		Employee e1=new Employee();
		e1.setName("Pooja");
		return e1;
	}
	
	
}
