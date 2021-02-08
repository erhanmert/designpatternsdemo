package iterator;

import iterator.models.GeekyStoreIterator;

import java.util.ArrayList;
import java.util.List;

public class GeekyStoreCatalog {
    private List<Product> catalog;

    public GeekyStoreCatalog(){
        catalog = new ArrayList<>();

        addItem("superman comic","best town",12.99);
        addItem("batman comic","klklklkl",12.99);
        addItem("star wars","werwe",12.99);
        addItem("vikings","ragnar's revenge",12.99);
    }

    public void addItem(String name, String desciption, double price) {
        Product product = new Product(name,desciption,price);
        catalog.add(product);
    }

    public List<Product> getCatalog(){
        return catalog;
    }

    public GeekyStoreIterator createIterator(){
        return new GeekyStoreIterator(catalog);
    }
}
