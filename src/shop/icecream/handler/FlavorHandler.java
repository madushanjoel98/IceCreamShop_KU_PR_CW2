package shop.icecream.handler;

import shop.icecream.models.Icecream;

public class FlavorHandler implements IceCreamCustomizationHandler {
    private IceCreamCustomizationHandler nextHandler;

    public void setNextHandler(IceCreamCustomizationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Icecream iceCream) {
        // Handle flavor customization
        System.out.println("Handling flavor customization: " + iceCream.getFlavour());

        // If there's a next handler, pass the request
        if (nextHandler != null) {
            nextHandler.handleRequest(iceCream);
        }
    }
}