package shop.icecream.state;

import shop.icecream.models.Delivery;
import shop.icecream.models.Order;

public interface OrderState {
    void handleOrder(Delivery order);
}