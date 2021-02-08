package strategy.two;

import strategy.two.controller.ShoppingCart;
import strategy.two.model.Product;

public class Main {
    public static void main(String args []){
        ShoppingCart shoppingCart = new ShoppingCart();

        Product pants = new Product("axca",25);
        Product shirt = new Product("fasf",15);

        shoppingCart.addProduct(pants);
        shoppingCart.addProduct(shirt);

        shoppingCart.setPaymentMethod("PP");
        shoppingCart.pay();
        shoppingCart.setPaymentMethod("CC");
        shoppingCart.pay();
    }
}
