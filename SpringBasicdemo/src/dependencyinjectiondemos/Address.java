package dependencyinjectiondemos;

public class Address {
String city;
int pincode;

public Address(){
	
}
//no parameterized constructor is needed when bean instantiaiton is through setter injection
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}
