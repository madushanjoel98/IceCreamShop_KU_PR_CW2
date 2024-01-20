package shop.icecream.models;

import java.util.Date;
import java.util.List;

import shop.icecream.state.OrderState;

public class Order {
	private long order_no;
	private List<Icecream> icreams;
	private Date bill_date;
	private Customer customer;
	private OrderStatus orderStatus;
	private OrderType orderType;
	private OrderPaymentStatus paymentStatus;
	private OrderState orderState;
	private CrewMember handeled_by;
	private Promotion promotion;
	
	
	public enum OrderPaymentStatus{
		PAYED,NON_PAY
	}
	public enum OrderStatus{
		
		PURCHASED,DELIVERD,ON_DELIVERY,CANCELED,PLACED
	}
	public enum OrderType{
		WithCustomer,DELIVERY
	}
	public double calculateTotal() {
		//Calculate Total
		double total = 0;

		for (Icecream icecream : icreams) {
			total = icecream.getTotal() + total;
		}

		return total;
	}
	public double priceAfterPromotion() {
		//Price After Promotion
		double output=0,s=0;
		if(promotion !=null) {
			s=100-promotion.getPrecentage();
			output= (s*calculateTotal())/100;
			
		}
		return output;
	}
	
	public void displayBill() {
		//Print Bill
		System.out.println("************");
		System.out.println("Orders:");
		StringBuilder stringBuilder = new StringBuilder();

		for (Icecream icecream : icreams) {
			
			stringBuilder.append("\n Flavor    :" + icecream.getFlavour());
			stringBuilder.append("\n Qunity(ml):" + icecream.getQuantity());
			stringBuilder.append("\n price     :" + icecream.getTotal());
			stringBuilder.append("\n............................");
		}
		if(this.promotion !=null) {
			//Check Promotion added
			stringBuilder.append("\n Promotion :" + this.promotion.name());
			stringBuilder.append("\n Sub Total :" + calculateTotal());
			stringBuilder.append("\n Total:" + priceAfterPromotion());
		}else{
		stringBuilder.append("\n Total:" + calculateTotal());
		}
		stringBuilder.append("\n bilNO:" + this.order_no);
		System.out.println(stringBuilder.toString());
	}
	//Getters and setters....
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

	public long getOrder_no() {
		return order_no;
	}

	public void setOrder_no(long order_no) {
		this.order_no = order_no;
	}

	public List<Icecream> getIcreams() {
		return icreams;
	}

	public void setIcreams(List<Icecream> icreams) {
		this.icreams = icreams;
	}

	public Date getBill_date() {
		return bill_date;
	}

	public void setBill_date(Date bill_date) {
		this.bill_date = bill_date;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public OrderPaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(OrderPaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public OrderState getOrderState() {
		return orderState;
	}

	public void setOrderState(OrderState orderState) {
		this.orderState = orderState;
	}

	public CrewMember getHandeled_by() {
		return handeled_by;
	}

	public void setHandeled_by(CrewMember handeled_by) {
		this.handeled_by = handeled_by;
	}


	public Order(long order_no, List<Icecream> icreams, Date bill_date, Customer customer, OrderType orderType,
			CrewMember handeled_by, Promotion promotion) {
		super();
		this.order_no = order_no;
		this.icreams = icreams;
		this.bill_date = bill_date;
		this.customer = customer;
		this.orderType = orderType;
		this.handeled_by = handeled_by;
		this.promotion = promotion;
	}


	public Order() {
		super();
	}

	
	

}
