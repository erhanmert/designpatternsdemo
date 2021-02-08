package iterator.models;

import iterator.Product;

import java.util.List;

public class DevStoreIterator implements Iterator {
    Product[] catalog;
    int position=0;

    public DevStoreIterator(Product [] catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        if(position >=catalog.length || catalog[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Product product = catalog[position];
        position++;
        return product;
    }
}
