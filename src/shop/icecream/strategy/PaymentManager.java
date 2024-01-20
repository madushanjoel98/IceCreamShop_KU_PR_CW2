package shop.icecream.strategy;

import shop.icecream.models.Order;

public class PaymentManager {
	private PaymentStrategy paymentStrategy;

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	   public void processPayment(Order order) {
	        if (paymentStrategy != null) {
	            paymentStrategy.processPayment(order);
	        } else {
	            System.out.println("Payment strategy not set.");
	        }
	    }

}
