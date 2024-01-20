package shop.icecream.models;

public enum Promotion {
	ChristmasPromotion(30),NEWYEARSPECIAL(20),MIDDYEAR(20);
private final double precentage;

private Promotion(double precentage) {
	this.precentage = precentage;
}

public double getPrecentage() {
	return precentage;
}

	
	
}
