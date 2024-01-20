package shop.icecream.strategy;

import shop.icecream.models.Order;

public interface PaymentStrategy {
	 void processPayment(Order order);
	
}
