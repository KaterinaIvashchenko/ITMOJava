package CarFactory;


public class Main {

    public static void main(String[] args) {

        Factory[] factories = {new BeetleFactory(), new BusFactory()};
        for (Factory factory: factories) {
            Car car = factory.build();
            System.out.printf("Created - %s\n", car.carName());
        }
    }
}
