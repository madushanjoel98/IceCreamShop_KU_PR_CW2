package shop.icecream.state;

import shop.icecream.models.Delivery;
import shop.icecream.models.Order;

public class OutForDeliveryOrderState implements OrderState {
    @Override
    public void handleOrder(Delivery order) {
        System.out.println("Order is out for delivery. On its way to you!");
        order.getOrder().setOrderState(new DeliveredOrderState());
    }
}