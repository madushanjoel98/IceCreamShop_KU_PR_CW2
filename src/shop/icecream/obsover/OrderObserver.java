package shop.icecream.obsover;

import shop.icecream.models.Order;

public interface OrderObserver {
	void updateStatus(Order order);
}
// Subject interface
