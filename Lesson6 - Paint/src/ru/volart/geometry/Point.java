package ru.volart.geometry;

import java.awt.*;

public class Point implements Shape {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distance(Point p) {
        return (int) Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawOval(x, y, 1, 1);
    }
}
