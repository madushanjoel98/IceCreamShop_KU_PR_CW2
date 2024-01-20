package shop.icecream.builder;

import java.util.List;

import shop.icecream.models.Icecream;
import shop.icecream.models.Icecream.Flavor;
import shop.icecream.models.Icecream.Syrup;
import shop.icecream.models.Icecream.Toppings;

public interface IceCream_Maker {
	void addIceCreamFlavor(Flavor flavor,double qunity);
	void addToppings(List<Toppings> toppings);
	void addSyrup(Syrup syrup);
	
	Icecream build();
}
