package shop.icecream.state;

import shop.icecream.models.Delivery;
import shop.icecream.models.Order;

public class DeliveredOrderState implements OrderState {
    @Override
    public void handleOrder(Delivery order) {
        System.out.println("Order is delivered. Enjoy your ice cream!");
    }
}