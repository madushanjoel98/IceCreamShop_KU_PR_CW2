package shop.icecream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import shop.icecream.builder.OrderBuilder;
import shop.icecream.command.Command;
import shop.icecream.command.FeedbackInvoker;
import shop.icecream.command.FeedbackReciver;
import shop.icecream.command.GiveFeedbackCommand;
import shop.icecream.command.OrderInvoker;
import shop.icecream.command.OrderReceiver;
import shop.icecream.command.PlaceOrderCommand;
import shop.icecream.handler.FlavorHandler;
import shop.icecream.handler.IceCreamCustomizationHandler;
import shop.icecream.handler.SyrupHandler;
import shop.icecream.handler.ToppingHandler;
import shop.icecream.models.Customer;
import shop.icecream.models.FeedBack;
import shop.icecream.models.Icecream;
import shop.icecream.models.Icecream.Flavor;
import shop.icecream.models.Icecream.Syrup;
import shop.icecream.models.Icecream.Toppings;
import shop.icecream.models.Order;
import shop.icecream.models.PreSetIceCreams;

public class Main {

	
	
	public static void main(String[] args) {
		Order order=new Order();
		FeedBack feedback=new FeedBack();
		feedback.setOrder(order);
        OrderReceiver orderReceiver = new OrderReceiver(order);
        FeedbackReciver feedbackReceiver = new FeedbackReciver();
        feedbackReceiver.setFeedBack(feedback);
        Command placeOrderCommand = new PlaceOrderCommand(orderReceiver);
        Command giveFeedbackCommand = new GiveFeedbackCommand(feedbackReceiver);

        OrderInvoker orderInvoker = new OrderInvoker();
        FeedbackInvoker ordFeedbackInvoker=new FeedbackInvoker();
        
        orderInvoker.addToQueue(placeOrderCommand);
        ordFeedbackInvoker.addToQueue(giveFeedbackCommand);

        // Simulate processing the command queue
        orderInvoker.processCommands();
        ordFeedbackInvoker.processCommands();
    }
}
