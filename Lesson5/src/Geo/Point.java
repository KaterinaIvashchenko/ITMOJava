package Geo;

import java.util.Scanner;

/**
 * Created by katerina on 11/2/16.
 */

public class Point {
    private double x;
    private double y;

    /**
     * 3) Измените в классе Point конструктор по умолчанию таким образом, чтобы начальные координаты точки при
     её создании пользователь задавал с клавиатуры. (<= Условия задачи не очевидны)
     */

    public Point() {
        while (true) {
            System.out.println("Введите координату X:");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
                break;
            } else {
                System.out.println("Enter valid value!");
            }
        }

        while (true) {
            System.out.println("Введите координату Y:");
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
        this.y = y;
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
        this.y = y;
    }

    /**
     * 1) Создайте в классе Point метод, который будет выводить на экран сообщение о том, в какой координатной четверти лежит точка.
     */
    public void pointQuarter() {
        if (x > 0 && y > 0) {
            System.out.println("Точка находится в координатной четверти - I");
        }
        if (x < 0 && y < 0) {
            System.out.println("Точка находится в координатной четверти - III");
        }
        if (x < 0 && y > 0) {
            System.out.println("Точка находится в координатной четверти - II");
        }
        if (x > 0 && y < 0) {
            System.out.println("Точка находится в координатной четверти - IV");
        }
    }

    /**
     * 2) Создайте в классе Point метод, проверяющий, являются ли две точки симметричными относительно начала отсчёта.
     */

    public boolean pointSymmetry(Point k) {
        if (this.x + k.x == 0 && this.y + k.y == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 4) Создайте в классе Point метод, проверяющий, являются ли три точки коллинеарными (т.е. лежащими на одной прямой).
     * Площадь = 1 / 2 ((x1 y2 + x2 y3 + x3 y1) — ( x2 y1 + x3 y2 + x1 y3))
     */

    public boolean collinearPoints(Point point1, Point point2){
        double square = ((point1.x * point2.y + point2.x * this.y + this.x * point1.y) - (point2.x * point1.y + this.x * point2.y + point1.x * this.y));
        if (square == 0) {
            System.out.println(point1.toString() + point2.toString() + this.toString() + "Точки являются коллинеарными.");
            return true;
        } else {
            System.out.println(point1.toString() + point2.toString() + this.toString() + " не являются коллинеарными.");
            return false;
        }
    }

}
