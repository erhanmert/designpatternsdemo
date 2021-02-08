package strategy.two.controller;

import strategy.two.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    List<Product> productList;
    String paymentMethod;

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    Map<String, Payment> paymentDecider = new HashMap<>();
    {
        paymentDecider.put("CC",new CreditCartAlgorithm("erhan","1234 1244"));
        paymentDecider.put("PP",new PayPalAlgorithm("erhan@erhan.com","15351"));
    }

    public ShoppingCart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.productList.add(product);
    }

    public void removeProduct(Product product){
        this.productList.remove(product);
    }

    public int calculateTotal(){
        int sum=0;
        for(Product product:productList){
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(){
        int amount = calculateTotal();
        paymentDecider.get(paymentMethod).pay(amount);
    }
}
