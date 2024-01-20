package shop.icecream.handler;

import shop.icecream.models.Icecream;

public class SyrupHandler implements IceCreamCustomizationHandler {
    @Override
    public void handleRequest(Icecream iceCream) {
        // Handle syrup customization
        System.out.println("Handling syrup customization: " + iceCream.getSyrup());
    }

	@Override
	public void setNextHandler(IceCreamCustomizationHandler toppingHandler) {
		// TODO Auto-generated method stub
		
	}
}