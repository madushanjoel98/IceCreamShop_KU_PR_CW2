package shop.icecream.command;

import shop.icecream.models.FeedBack;
import shop.icecream.models.Order;
import shop.icecream.models.Order.OrderStatus;

public class FeedbackReciver {
private	FeedBack feedBack;
	
	public void gatherFeedback() {
	
		 System.out.println("Feedback submitted. Thank you!");
	}
	 public void deleteFeedback() {
		 if(this.feedBack !=null) {
	       this.feedBack=null;
	       System.out.println("Feedback deleted!");
		 }
	    }
	
	 
	 //getters setter
	 public FeedBack getFeedBack() {
		return feedBack;
	}
	
	

	public void setFeedBack(FeedBack feedBack) {
		this.feedBack = feedBack;
	}

}
