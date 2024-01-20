package shop.icecream.command;

import shop.icecream.models.Order;
import shop.icecream.models.Order.OrderStatus;

public class OrderReceiver {
	private Order order;
	public void placeOrder() {
		 order.setOrderStatus(OrderStatus.PLACED);
        System.out.println("Order placed successfully!");
      
    }
    public void cancelOrder() {
        System.out.println("Order cancelled!");
        order.setOrderStatus(OrderStatus.CANCELED);
    }
    //Constructor and getters and setters
    public OrderReceiver(Order order) {
		super();
		this.order = order;
	}
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
    
}
