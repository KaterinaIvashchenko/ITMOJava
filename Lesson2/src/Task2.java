/**
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 * В три переменные a, b и c записаны три вещественных числа <=]
 */
public class Task2 {
    public static void main(String[] args) {
        double a = 4.9;
        double b = 9.8;
        int c = 10;
        if (Math.abs(c - a) > Math.abs(c - b)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
