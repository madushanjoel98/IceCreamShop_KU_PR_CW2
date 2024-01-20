package shop.icecream.models;

import java.util.Date;

public class Purchase {
	private long bill_no;
 private Date purchasDate;
 private Order order;
 private PaymentMethod payMethod;
 public void displayBill() {
	 StringBuilder stringBuilder = new StringBuilder();
	 	stringBuilder.append("\n customerName:"+order.getCustomer().getName() );
	 	stringBuilder.append("\n 	  Bill NO:"+bill_no );
		System.out.println("************");
		
		System.out.println("Orders:");
		

		for (Icecream icecream : order.getIcreams()) {
			
			stringBuilder.append("\n Flavor    :" + icecream.getFlavour());
			stringBuilder.append("\n Qunity(ml):" + icecream.getQuantity());
			stringBuilder.append("\n Price     :" + icecream.getTotal());
			stringBuilder.append("\n............................");
		}
		stringBuilder.append("\n Total:" + order.calculateTotal());
		stringBuilder.append("\n********************************" );
		
		stringBuilder.append("\n PayedWith:"+payMethod );
		System.out.println(stringBuilder.toString());
	}

 
 
 
 public enum PaymentMethod {

		CREDIT_CARD, CASH,DIGITAL_WALLET,DEBIT_CARD

	}
	
	
}
