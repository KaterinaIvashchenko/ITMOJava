package Produkt;

import java.util.Comparator;

/**
 * Created by katerina on 11/21/16.
 */

public class SortedByPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) Math.signum((o1.getPrice() - o2.getPrice()));
    }
}
