package Spring_AOP.NewSampleSpringAOPproject.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
@Value("Dummy Name")
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 
public void throwException(){
	throw new RuntimeException("Dummy Exception");
}
}
