package Fib;

/**
 * Рекурсия
 */

public class Main {

    public static void main(String[] args) {
//       fib(2);
        System.out.println(fib(3));
    }

    public static int fib(int n) {
//        System.out.println(n);
        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}