package decorator;

import decorator.interfaces.IceCream;
import decorator.model.BasicIceCream;
import decorator.model.ChocolateIceCream;
import decorator.model.MintIceCream;
import decorator.model.VanillaIceCream;

public class Main {

    public static void main(String [] args){
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic ice cream cost :"+ basicIceCream.cost());

        //add vanilla

        IceCream vanillaIceCream = new VanillaIceCream(basicIceCream);
        System.out.println("Vanilla ice cream cost :"+ vanillaIceCream.cost());

        IceCream mintIceCream = new MintIceCream(vanillaIceCream);
        System.out.println("Mint ice cream cost :"+ mintIceCream.cost());


    }
}
