package car.outer;

/**
 * Created by katerina on 10/31/16.
 */
public class Body {

    private  static  final int WHEEL_NUMBERS = 4;

    private Color color;
    private Wheel[] wheels;

    public Body(Color color) {
        this.color = color;
        this.wheels = new Wheel[WHEEL_NUMBERS];

        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }

    public void move(){
        System.out.println(toString() + " is moving.");
        for (Wheel w : wheels) {
            w.rotate();
        }
    }
}
