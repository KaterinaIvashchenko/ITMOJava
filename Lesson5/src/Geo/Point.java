package Geo;

import java.util.Scanner;

/**
 * Created by katerina on 11/2/16.
 */

public class Point {
    private double x;
    private double y;

    public Point() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                break;
            } else {
                System.out.println("Enter valid value!");
            }
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                y = scanner.nextDouble();
                break;
            } else {
                System.out.println("Enter valid value!");
            }
        }
    }

    public Point(double x, double y) {
        this.x = x;
        this.x = y;
    }

    public void print() {
        System.out.println(toString());
    }

    public void move(double a, double b) {
        x += a;
        y += b;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Point) && ((Point) obj).x == x && ((Point) obj).y == y;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(x).append(", ").append(y).append(")");
        return sb.toString();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.x = y;
    }
}
