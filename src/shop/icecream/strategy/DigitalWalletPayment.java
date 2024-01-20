package shop.icecream.strategy;

import java.util.Date;

import shop.icecream.models.Order;
import shop.icecream.models.Order.OrderPaymentStatus;

public class DigitalWalletPayment implements PaymentStrategy {
	@Override
	public void processPayment(Order order) {
		System.out.println("Processing credit card payment of RS:" + order.calculateTotal());
		order.setBill_date(new  Date());
		order.setPaymentStatus(OrderPaymentStatus.PAYED);
		order.displayBill();
		
	} 
}
