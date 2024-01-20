package shop.icecream.handler;

import shop.icecream.models.Icecream;

public class ToppingHandler implements IceCreamCustomizationHandler {
    private IceCreamCustomizationHandler nextHandler;

    public void setNextHandler(IceCreamCustomizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Icecream iceCream) {
        // Handle topping customization
        System.out.println("Handling topping customization: " + iceCream.getToppings());

        // If there's a next handler, pass the request
        if (nextHandler != null) {
            nextHandler.handleRequest(iceCream);
        }
    }
}