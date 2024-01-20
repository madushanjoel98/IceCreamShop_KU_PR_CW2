package shop.icecream.builder;

import java.util.List;

import shop.icecream.models.Icecream;
import shop.icecream.models.Icecream.Flavor;
import shop.icecream.models.Icecream.Syrup;
import shop.icecream.models.Icecream.Toppings;
//Builder pattern
public class IceCreamMaker_IMPL implements IceCream_Maker{
private Icecream iceCream;

public IceCreamMaker_IMPL(){
	this.iceCream=new Icecream();
}
	@Override
	public void addToppings(List<Toppings> toppings) {
		this.iceCream.setToppings(toppings);
		
	}

	@Override
	public void addSyrup(Syrup syrup) {
	this.iceCream.setSyrup(syrup);
		
	}

	@Override
	public Icecream build() {
		return this.iceCream;
	}

	@Override
	public void addIceCreamFlavor(Flavor flavor, double qunity) {
		this.iceCream.setFlavour(flavor);
		this.iceCream.setQuantity(qunity);
		
	}

}
