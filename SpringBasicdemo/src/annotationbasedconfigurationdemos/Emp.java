package annotationbasedconfigurationdemos;

import org.springframework.stereotype.Component;

@Component
public class Emp {
private int empid;

public void setEmpid(int empid) {
	this.empid = empid;
}

public int getEmpid() {
	return empid;
}

}
