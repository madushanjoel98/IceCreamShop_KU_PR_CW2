package shop.icecream.models;

public class Delivery {

private Order order;
private String delivery_address;
private String delivery_mobileNo;
private DeliveryStatus status;

public enum DeliveryStatus{
	ONPROCESS,Delivered,ONPreparation
}
//Getters and setters

public Order getOrder() {
	return order;
}

public void setOrder(Order order) {
	this.order = order;
}

public String getDelivery_address() {
	return delivery_address;
}

public void setDelivery_address(String delivery_address) {
	this.delivery_address = delivery_address;
}

public String getDelivery_mobileNo() {
	return delivery_mobileNo;
}

public void setDelivery_mobileNo(String delivery_mobileNo) {
	this.delivery_mobileNo = delivery_mobileNo;
}

public DeliveryStatus getStatus() {
	return status;
}

public void setStatus(DeliveryStatus status) {
	this.status = status;
}

	
}
