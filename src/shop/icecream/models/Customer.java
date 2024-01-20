package shop.icecream.models;

public class Customer {
private String name;
private String email;
private String mobile_number;
private String address;
private double loyaltyPoints;





public double getLoyaltyPoints() {
	return loyaltyPoints;
}
public void setLoyaltyPoints(double loyaltyPoints) {
	this.loyaltyPoints = loyaltyPoints;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile_number() {
	return mobile_number;
}
public void setMobile_number(String mobile_number) {
	this.mobile_number = mobile_number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
	
}
