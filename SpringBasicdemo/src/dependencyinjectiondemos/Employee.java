package dependencyinjectiondemos;

//JAVA POJO class
public class Employee {
int empno;
String empName;
Address adr;
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
public void setAdr(Address adr) {
	this.adr = adr;
}
@Override
 public String toString(){
	 return ("employee name "+empName+" "+"employee Number "+empno+" "+"City "+adr.getCity()+" pincode "+adr.getPincode());
 }

}
