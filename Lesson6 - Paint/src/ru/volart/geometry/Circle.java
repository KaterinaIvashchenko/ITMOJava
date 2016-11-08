package ru.volart.geometry;

import java.awt.*;

public class Circle implements Shape {

    private final Point center;
    private final int r;

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(0, 0, 255));
        g.drawOval(center.getX(), center.getY(), r, r);
    }
}
