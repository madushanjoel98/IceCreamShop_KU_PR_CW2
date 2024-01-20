package shop.icecream.state;

import shop.icecream.models.Delivery;
import shop.icecream.models.Order;
import shop.icecream.models.Order.OrderStatus;

public class PlacedOrderState implements OrderState {
    @Override
    public void handleOrder(Delivery order) {
        System.out.println("Order is placed. Waiting for preparation.");
      
        order.getOrder().setOrderState(new PlacedOrderState());
    }
}
