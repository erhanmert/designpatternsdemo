package decorator.model;

import decorator.interfaces.IceCream;
import decorator.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding chocolate ice cream");
        return 1.0 + super.cost();
    }
}
