package ru.volart.geometry;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by katerina on 11/7/16.
 */
public class Car implements Shape {

    private final static int RADIUS = 30;

    private List<Shape> shapes = new ArrayList<>();

    public Car() {
        Point bS = new Point(50, 125);
        Point bE = new Point(150, 190);
        Rectangle body = new Rectangle(bS, bE);
        shapes.add(body);

        Point cS = new Point(70, 100);
        Point cE = new Point(120, 150);
        Rectangle cab = new Rectangle(cS, cE);
        shapes.add(cab);

        Point wS = new Point(80, 110);
        Point wE = new Point(110, 140);
        Rectangle window = new Rectangle(wS, wE);
        shapes.add(window);

        Circle wheel1 = new Circle(new Point(bS.getX(), bE.getY()), 30);
        Circle whheel2 = new Circle(bE, RADIUS);
        shapes.add(wheel1);
        shapes.add(whheel2);
    }

    @Override
    public void paint(Graphics g) {
        for (Shape sh : shapes) {
            sh.paint(g);
        }
    }
}
