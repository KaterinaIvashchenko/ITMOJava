package Produkt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by katerina on 11/21/16.
 */

public class Main {

    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Product("Milk", 48.65, 10);
        products[1] = new Product("Coffee", 148.65, 2);
        products[2] = new Product("Milk", 12.50, 140);

        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println();
        Arrays.sort(products, new SortedByName());
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();
        Arrays.sort(products, new SortedByPrice());
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println();
        Arrays.sort(products, new SortedByQuantity());
        for (Product p : products) {
            System.out.println(p);
        }

        List<Product> productList = Arrays.asList(products);
        Collections.sort(productList);

        List<Product> productList2 = Arrays.asList(products);
        Collections.sort(productList2, new SortedByQuantity());

        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        iterator = productList2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}