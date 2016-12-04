package CarFactory;


public class BeetleFactory implements Factory {

    @Override
    public Car build() {
        return new Beetle();
    }
}
