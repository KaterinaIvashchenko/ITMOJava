/**
 * Создать программу, проверяющую и сообщающую на экран, является ли целое число
 * записанное в переменную n, чётным либо нечётным.
 */
public class Task1 {
    public static void main(String[] args) {
        int n = 11;
        if (n % 2 > 0) {
            System.out.println(n + " - число является нечетным.");
        } else {
            System.out.println(n + " - число является четным.");
        }

    }
}
