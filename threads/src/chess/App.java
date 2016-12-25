package chess;

/**
 * Created by katerina on 12/25/16.
 */

public class App {
    public static void main(String[] args) {

        Clock clock = new Clock();
        Human human1 = new Human("Garry", true, clock);
        Human human2 = new Human("Petr", false, clock);

        human1.start();
        human2.start();
    }
}
