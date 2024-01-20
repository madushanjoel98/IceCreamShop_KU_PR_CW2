package shop.icecream.models;

import java.util.List;

public class Icecream {
	private String name;
	private Flavor flavour;
	private double quantity; // milliliters
	private Syrup syrup;
	private List<Toppings> toppings;

	public Icecream(Flavor flavour, double quantity, Syrup syrup, List<Toppings> toppings) {
		this.flavour = flavour;
		this.quantity = quantity;
		this.syrup = syrup;
		this.toppings = toppings;
	}

	public Icecream() {
		// Default constructor
	}
	
	public double getTotal() {
		//Get price of the iceCream
		double total = this.quantity * this.flavour.price;
		total += this.syrup.price;

		for (Toppings topping : toppings) {
			total += topping.price;
		}

		return total;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Flavor getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavor flavour) {
		this.flavour = flavour;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public Syrup getSyrup() {
		return syrup;
	}

	public void setSyrup(Syrup syrup) {
		this.syrup = syrup;
	}

	public List<Toppings> getToppings() {
		return toppings;
	}

	public void setToppings(List<Toppings> toppings) {
		this.toppings = toppings;
	}

	
	// Enums...

	public enum Flavor {
		VANILLA(1), CHOCOLATE(1.5), STRAWBERRY(1.7), FRUIT_AND_NUT(2);

		private final double price;

		private Flavor(double price) {
			this.price = price;
		}
	}

	public enum Syrup {
		CHOCO_SYRUP(15), ROSE_SYRUP(17.50), HONEY_SYRUP(20.50);

		private final double price;

		private Syrup(double price) {
			this.price = price;
		}
	}

	public enum Toppings {
		DRY_FRUITS(50), NUTS(40), CHOCO_CHIP(20.50);

		private final double price;

		private Toppings(double price) {
			this.price = price;
		}
	}
}
