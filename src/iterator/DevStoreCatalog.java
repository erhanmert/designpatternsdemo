package iterator;

import iterator.models.DevStoreIterator;

public class DevStoreCatalog {

    private static final int MAX_ITEMS = 4;
    private int numberOfProducts = 0;
    Product [] catalog;

    public DevStoreCatalog(){
        catalog = new Product[MAX_ITEMS];

        addItem("c++ bro","t-shirt",39.99);
        addItem("java rocks","mouse-pad",59.99);
        addItem("design patterns","book",139.99);
        addItem("cook book","cook book",19.99);
    }

    public void addItem(String name, String description, double price) {
        Product product = new Product(name,description,price);

        if(numberOfProducts >= MAX_ITEMS){
            System.out.println("catalog is full");
        }else{
            catalog[numberOfProducts]=product;
            numberOfProducts++;
        }
    }

    public DevStoreIterator createIterator(){
        return new DevStoreIterator(catalog);
    }
}
