package shop.icecream.models;

public class CrewMember {
private String fullName;
private String nic;
private long empid;
private Shop shop;
//Geetter & setter....


public Shop getShop() {
	return shop;
}
public void setShop(Shop shop) {
	this.shop = shop;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getNic() {
	return nic;
}
public void setNic(String nic) {
	this.nic = nic;
}
public long getEmpid() {
	return empid;
}
public void setEmpid(long empid) {
	this.empid = empid;
}


}
