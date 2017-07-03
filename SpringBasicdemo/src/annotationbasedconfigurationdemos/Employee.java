package annotationbasedconfigurationdemos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//JAVA POJO class
@Component
public class Employee {
	@Value("101")
int empno;
	@Value("John")
String empName;
@Autowired
//@Qualifier("address2")
Address adr;
//@Qualifier is used when more than one bean instance is available for reference bean
//@autowired annotation can be applied only on non-primitive types (behaves like byType method).It can be applied to properties,setter methods,constructor arg

public Employee() {
	
}

// paramaterized constructor must be defined when constructor based dependency injection is used

public Employee(int empno, String empName,Address adr) {
	this.empno = empno;
	this.empName = empName;
	this.adr=adr;
}


//getter and setter methods used for setter based DI
public int getEmpno() {
	return empno;
}

public void setEmpno(int empno) {
	this.empno = empno;
}
public String getEmpName() {
	return empName;
}

public void setEmpName(String empName) {
	this.empName = empName;
}
public Address getAdr() {
	return adr;
}
//@Autowired
public void setAdr(Address adr) {
	this.adr = adr;
}
@Override
 public String toString(){
	// return ("employee name "+empName+" "+"employee Number "+empno);
	 return ("employee name "+empName+" "+"employee Number "+empno+" "+"City "+adr.getCity()+" pincode "+adr.getPincode());
 }

}
