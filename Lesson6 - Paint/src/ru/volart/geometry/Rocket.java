package ru.volart.geometry;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Рисуем ракету!
 */
public class Rocket implements Shape {
    private final static int RADIUS_IN = 16;
    private final static int RADIUS_OUT = 20;

    private List<Shape> shapes = new ArrayList<>();

    public Rocket() {

        //Создаем тело ракеты.
        Point bodyRocketStartPoint = new Point(120, 90);
        Point bodyRocketEndPoint = new Point(180, 180);
        Rectangle body = new Rectangle(bodyRocketStartPoint, bodyRocketEndPoint);
        shapes.add(body);

        //Создаем иллюминатор (1).
        Circle illuminatorOneOut = new Circle(new Point(140, 100), RADIUS_OUT);
        Circle illuminatorOneIn = new Circle(new Point(142, 102), RADIUS_IN);
        shapes.add(illuminatorOneIn);
        shapes.add(illuminatorOneOut);

        //Создаем иллюминатор (2).
        Circle illuminatorTwoOut = new Circle(new Point(140, 130), RADIUS_OUT);
        Circle illuminatorTwoIn = new Circle(new Point(142, 132), RADIUS_IN);
        shapes.add(illuminatorTwoIn);
        shapes.add(illuminatorTwoOut);

        //Создаем головной убор ракеты.
        Triangle hatRocket = new Triangle(new Point(120, 90), new Point(180, 90), new Point(150, 40));
        shapes.add(hatRocket);

        //Создаем крылья ракеты.
        Triangle wingsRightRocket = new Triangle(new Point(180, 180), new Point(180, 140), new Point(210, 180));
        shapes.add(wingsRightRocket);

        Triangle wingsLeftRocket = new Triangle(new Point(120, 180), new Point(120, 140), new Point(90, 180));
        shapes.add(wingsLeftRocket);
    }

    @Override
    public void paint(Graphics g) {
        for (Shape sh : shapes) {
            sh.paint(g);
        }
    }
}
