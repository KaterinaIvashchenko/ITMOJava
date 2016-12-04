package PizzaHome;


public class Kitchen {

    public static void main(String[] args) {

        Pizza Katerita = new Pizza.Cook(1).yummy("Katerita").eggs(6).chicken(1).mushrooms(12).tomatoes(4).cook();

        System.out.println(Katerita);
    }
}
