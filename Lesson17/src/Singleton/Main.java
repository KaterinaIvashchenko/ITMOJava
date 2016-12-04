package Singleton;

/**
 * Created by katerina on 12/4/16.
 */

public class Main {

    public static void main(String[] args) {
       Configuration number1 = Configuration.getInstance();
       number1.print();

       Configuration number2 = Configuration.getInstance();
       number2.print();
    }
}
