package shop.icecream.command;

public class PlaceOrderCommand implements Command{
	private OrderReceiver orderReceiver;

    public PlaceOrderCommand(OrderReceiver orderReceiver) {
        this.orderReceiver = orderReceiver;
    }

    @Override
    public void execute() {
        orderReceiver.placeOrder();
    }

    @Override
    public void undo() {
        orderReceiver.cancelOrder();
    }
}
