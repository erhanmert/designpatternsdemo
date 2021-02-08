package iterator.models;

import iterator.DevStoreCatalog;
import iterator.GeekyStoreCatalog;
import iterator.Product;

public class Seller {
    GeekyStoreCatalog geekyStoreCatalog;
    DevStoreCatalog devStoreCatalog;

    public Seller(GeekyStoreCatalog geekyStoreCatalog,DevStoreCatalog devStoreCatalog) {
        this.geekyStoreCatalog = geekyStoreCatalog;
        this.devStoreCatalog = devStoreCatalog;
    }

    public void printCatalog(){
        GeekyStoreIterator  geekyStoreIterator = geekyStoreCatalog.createIterator();
        System.out.println("printing geeky catalog");
        printCatalog(geekyStoreIterator);

        System.out.println("printing dev catalog");
        DevStoreIterator devStoreIterator = devStoreCatalog.createIterator();
        printCatalog(devStoreIterator);

    }

    private void printCatalog(Iterator iterator){
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println(product.getName() + " "+ product.getDescription()+ " "+ product.getPrice());
        }
    }
}
