package ru.volart.geometry;

//Создаем треугольник.

import java.awt.*;

public class Triangle implements Shape {

    private Point vertex1;
    private Point vertex2;
    private Point vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(vertex1.getX(), vertex1.getY(), vertex2.getX(), vertex2.getY());
        g.drawLine(vertex1.getX(), vertex1.getY(), vertex3.getX(), vertex3.getY());
        g.drawLine(vertex2.getX(), vertex2.getY(), vertex3.getX(), vertex3.getY());
        vertex1.paint(g);
        vertex2.paint(g);
        vertex3.paint(g);
    }
}
