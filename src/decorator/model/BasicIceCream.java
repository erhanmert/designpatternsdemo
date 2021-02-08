package decorator.model;

import decorator.interfaces.IceCream;

public class BasicIceCream implements IceCream {
    private IceCream iceCream;

    public BasicIceCream() {
        System.out.println("creating basic ice cream");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
