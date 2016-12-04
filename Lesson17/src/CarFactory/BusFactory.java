package CarFactory;


public class BusFactory implements Factory {

    @Override
    public Car build() {
        return new Bus();
    }
}
