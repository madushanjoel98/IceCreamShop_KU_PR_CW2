package shop.icecream.builder;

import shop.icecream.models.Customer;
import shop.icecream.models.Order;
import shop.icecream.models.Order.OrderType;

public class OrderBuilder {
private Order order;
 private IceCream_Maker iceCreamBuilder;
 
 public OrderBuilder () {
	 order=new  Order();
	 iceCreamBuilder=new IceCreamMaker_IMPL();
	 
 }
 public OrderBuilder withCustomer(Customer customer) {
	 order.setCustomer(customer);
	 return this;
 }
 
 public OrderBuilder withDelivery(Customer customer) {
	 order.setOrderType(OrderType.DELIVERY);
	 order.setCustomer(customer);
	 return this;
 }
	
	
}
