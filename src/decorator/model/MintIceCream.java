package decorator.model;

import decorator.interfaces.IceCream;
import decorator.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("adding mint ice cream");
        return 1.5 + super.cost();
    }
}
