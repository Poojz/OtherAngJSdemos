package Spring_AOP.NewSampleSpringAOPproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Spring_AOP.NewSampleSpringAOPproject.model.Employee;
@Component
public class EmployeeService {
@Autowired
private Employee employee;

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

}
