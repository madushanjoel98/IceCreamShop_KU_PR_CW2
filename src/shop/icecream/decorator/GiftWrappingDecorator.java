package shop.icecream.decorator;

import shop.icecream.models.Icecream;

public class GiftWrappingDecorator extends IceCreamDecorator {
	public GiftWrappingDecorator(Icecream decoratedIceCream) {
		super(decoratedIceCream);
		
	}

@Override
public Icecream build() {
	// TODO Auto-generated method stub
	return super.build();
}

}
