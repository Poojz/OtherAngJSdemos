package sampleaop.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
 int empid;

 String empName;

 String role;
 Address address;
 public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void display(){
	System.out.println("Employee details:"+empid+" "+empName+" "+role+""+address.getCity()+" "+address.getPincode());
}

}
