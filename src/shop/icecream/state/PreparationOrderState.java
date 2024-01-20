package shop.icecream.state;

import shop.icecream.models.Delivery;
import shop.icecream.models.Order;

public class PreparationOrderState implements OrderState {
    @Override
    public void handleOrder(Delivery order) {
        System.out.println("Order is in preparation. Almost ready!");
        order.getOrder().setOrderState(new OutForDeliveryOrderState());
    }
}

