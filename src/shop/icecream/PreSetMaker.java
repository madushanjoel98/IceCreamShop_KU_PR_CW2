package shop.icecream;

import java.util.ArrayList;
import java.util.List;

import shop.icecream.builder.IceCreamMaker_IMPL;
import shop.icecream.builder.IceCream_Maker;
import shop.icecream.models.Icecream;
import shop.icecream.models.Icecream.Flavor;
import shop.icecream.models.Icecream.Syrup;
import shop.icecream.models.Icecream.Toppings;
import shop.icecream.models.PreSetIceCreams;

public class PreSetMaker implements PreSetIceCreams {
	private IceCream_Maker maker;

	@Override
	public Icecream chochoWonderlander() {
		maker = new IceCreamMaker_IMPL();
		List<Toppings> topping = new ArrayList<>();
		topping.add(Toppings.CHOCO_CHIP);
		topping.add(Toppings.NUTS);
		maker.addSyrup(Syrup.CHOCO_SYRUP);
		maker.addIceCreamFlavor(Flavor.CHOCOLATE, 200);
		maker.addToppings(topping);
		return maker.build();
	}

	@Override
	public Icecream frutiiLooti() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Icecream fruiteAndNut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Icecream IceCreamKottu_Medium() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Icecream IceCreamKottu_Large() {
		// TODO Auto-generated method stub
		return null;
	}

}
