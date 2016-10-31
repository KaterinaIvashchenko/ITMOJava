package car;

import car.Inner.Engine;
import car.outer.Body;
import car.outer.Color;

/**
 * Created by katerina on 10/31/16.
 */
public class Main {

    public static  void main(String[] args){
        Engine engine = new Engine(8);
        Body body = new Body(new Color(0xffffff, Color.Type.METALIC));
        Car car = new Car(engine, body);

        car.move();
    }
}
