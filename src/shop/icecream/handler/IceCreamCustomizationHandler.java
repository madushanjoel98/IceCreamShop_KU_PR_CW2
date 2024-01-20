package shop.icecream.handler;

import shop.icecream.models.Icecream;

public interface IceCreamCustomizationHandler {
	void handleRequest(Icecream iceCream);

	void setNextHandler(IceCreamCustomizationHandler toppingHandler);
}



