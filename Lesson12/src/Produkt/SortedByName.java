package Produkt;

import java.util.Comparator;

/**
 * Created by katerina on 11/21/16.
 */

public class SortedByName implements Comparator <Product> {

    @Override
    public int compare(Product o1, Product o2) {

        return o1.getName().compareTo(o2.getName());
    }



}
