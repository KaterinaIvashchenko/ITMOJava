package CircleTask;

import java.util.Random;
import java.util.Scanner;

/**
 * 1) Создайте в классе Circle метод, вычисляющий длину окружности.
 *
 * 2) Создайте в классе Circle метод, перемещающий центр круга в случайную точку квадрата координатной
 * плоскости с диагональю от [-99;-99] до [99;99]. Обратите внимание на то, что требуется создать обычный метод,
 * применимый к уже существующему объекту, а не конструктор создающий новый объект.
 *
 * 3) Измените в классе Circle конструктор по умолчанию так, чтобы в момент создания объекта с его помощью,
 * координаты центра и радиус окружности пользователь вводил с клавиатуры.
 *
 * 4) Создайте в классе Circle метод, вычисляющий расстояние между центрами двух окружностей.
 *
 * Задачи решены без данного пункта задания:
 *
 * 5) Создайте в классе Circle метод, проверяющий, касаются ли окружности в одной точке.
 * Учтите, что возможен вариант, когда одна окружность содержится внутри другой и при этом всё равно
 * возможно касание в одной точке.
 */

public class Circle {
    public double x;
    public double y;
    public double r;

    public Circle() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите координату х: ");
        x = reader.nextDouble();
        System.out.println("Введите координату y: ");
        y = reader.nextDouble();
        System.out.println("Введите радиус r: ");
        r = reader.nextDouble();
    }

    public void printCircle() {
        System.out.println("Окружность с центром в (" + x + ";" + y + ") и радиусом " + r);
    }

    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }

    public void zoomCircle(double k) {
        r = r * k;
    }

    public double squareCircle() {
        double s = Math.PI * r * r;
        return s;
    }

    public double length() {
        double l = 2 * Math.PI * r;
        return l;
    }

    public void random() {
        Random ran = new Random();
        x = ran.nextInt(200) - 100;
        y = ran.nextInt(200) - 100;
    }

    public double calculateDistance(Circle secondCircle) {
        double a;
        double b;
        double c;
        if (this.x > secondCircle.x) {
            a = this.x - secondCircle.x;
        } else {
            a = secondCircle.x - this.x;
        }
        if (this.y > secondCircle.y) {
            b = this.y - secondCircle.y;
        } else {
            b = secondCircle.y - this.y;
        }
        c = Math.sqrt(a * a + b * b);
        return c;
    }
}
