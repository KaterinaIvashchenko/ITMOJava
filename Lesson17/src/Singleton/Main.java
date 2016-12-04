package Singleton;

/**
 * Created by katerina on 12/4/16.
 */

public class Main {

    public static void main(String[] args) {

       Configuration chislo = Configuration.getInstance();
       chislo.print();
    }
}
