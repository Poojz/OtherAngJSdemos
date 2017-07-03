package com.mavendemo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mavendemo1.model.Employee;

@Configuration
public class EmployeeConfig {
@Bean
	Employee employee()
	{
		Employee e=new Employee();
		e.setEmpid(102);
		e.setEmpName("Pooja");
		return e;
	}
}
