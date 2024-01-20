package shop.icecream.decorator;

import shop.icecream.models.Icecream;

public class SpecialPackagingDecorator extends IceCreamDecorator {
	public SpecialPackagingDecorator(Icecream decoratedIceCream) {
		super(decoratedIceCream);
		// TODO Auto-generated constructor stub
	}
@Override
public Icecream build() {
	// TODO Auto-generated method stub
	return super.build();
}
}
