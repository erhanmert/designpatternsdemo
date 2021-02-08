package iterator.models;

import iterator.Product;

import java.util.List;

public class GeekyStoreIterator implements Iterator {
    List<Product> catalog;
    int position=0;

    public GeekyStoreIterator(List<Product> catalog) {
        this.catalog = catalog;
    }

    @Override
    public boolean hasNext() {
        if(position >=catalog.size() || catalog.get(position ) == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Product product = catalog.get(position);
        position++;
        return product;
    }
}