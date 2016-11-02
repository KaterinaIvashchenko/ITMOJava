package Geo;

/**
 * Created by katerina on 11/2/16.
 */
public class Rectangle extends Shape {

    private Point start;
    private Point end;

    public Rectangle(Point center, Point start, Point end) {
        super(center);
        this.start = start;
        this.end = end;
    }

    public double square() {
        double sideTop = start.distance(new Point(end.getX(), start.getY()));
        double sideLeft = end.distance(new Point(start.getX(), end.getY()));
        return sideTop * sideLeft;
    }
}
