package CircleTask;

public class Main {
    public static void main(String[] args) {
        Circle objectOne = new Circle();
        objectOne.printCircle();
        objectOne.x = 5;
        objectOne.r = 29;
        objectOne.printCircle();
        objectOne.random();
        objectOne.printCircle();
        System.out.println("Площадь круга - " + objectOne.squareCircle());
        System.out.println("Длина окружности - " + objectOne.length());

        Circle objectTwo = new Circle();

        System.out.println("Это расстояние между центрами двух окружностей: " + objectOne.calculateDistance(objectTwo));
    }
}
