package shop.icecream.obsover;

import java.util.ArrayList;
import java.util.List;

import shop.icecream.models.Order;

public class RealTimeOrderTracker implements OrderSubject{
	private List<OrderObserver> observers = new ArrayList();
    private Order order;
    // Attach an observer to the subject
    @Override
    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    // Detach an observer from the subject
    @Override
    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

	@Override
	public void notifyObservers() {
		 for (OrderObserver observer : observers) {
	            observer.updateStatus(order);
	        }
		
	}

}
