package shop.icecream.decorator;

import java.util.List;

import shop.icecream.builder.IceCream_Maker;
import shop.icecream.models.Icecream;
import shop.icecream.models.Icecream.Flavor;
import shop.icecream.models.Icecream.Syrup;
import shop.icecream.models.Icecream.Toppings;
//Decorator abstract class
public abstract class IceCreamDecorator implements IceCream_Maker{
	protected Icecream decoratedIceCream;

	public IceCreamDecorator(Icecream decoratedIceCream) {
        this.decoratedIceCream = decoratedIceCream;
    }
	@Override
	public void addIceCreamFlavor(Flavor flavor, double qunity) {
		decoratedIceCream.setFlavour(flavor);
		decoratedIceCream.setQuantity(qunity);
		
	}

	@Override
	public void addToppings(List<Toppings> toppings) {
		decoratedIceCream.setToppings(toppings);
		
	}

	@Override
	public void addSyrup(Syrup syrup) {
		decoratedIceCream.setSyrup(syrup);
		
	}

	@Override
	public Icecream build() {
		// TODO Auto-generated method stub
		return decoratedIceCream;
	}
	
	
	

}
