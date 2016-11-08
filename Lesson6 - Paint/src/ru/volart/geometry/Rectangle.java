package ru.volart.geometry;

import java.awt.*;

public class Rectangle implements Shape {

    private Point start;
    private Point end;

    public Rectangle(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(start.getX(), start.getY(), Math.abs(end.getX() - start.getX()), Math.abs(end.getY() - start.getY()));
        start.paint(g);
        end.paint(g);
    }
}
