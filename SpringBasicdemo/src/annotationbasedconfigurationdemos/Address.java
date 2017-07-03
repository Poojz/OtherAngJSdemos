package annotationbasedconfigurationdemos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Chennai")
String city;
	@Value("123456")
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
