package car;

import car.Inner.Engine;
import car.outer.Body;

/**
 * Creating the car.
 */
public class Car {
    private Engine engine;
    private Body body;

    public Car(Engine engine, Body body) {
        this.engine = engine;
        this.body = body;
    }

    public void move(){
        while (!engine.checkWorking()){
            engine.start();
        }
        body.move();

        engine.stop();
    }
}
