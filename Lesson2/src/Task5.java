import java.util.Random;

/**
 * Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
 * Примеры работы программы:
 * В числе 208 наибольшая цифра 8
 * В числе 774 наибольшая цифра 7
 * В числе 613 наибольшая цифра 6.
 */
public class Task5 {
    public static void main(String[] args) {
        Random ran = new Random();
        String x = Integer.toString(ran.nextInt(899) + 100);
        System.out.print("В числе " + x + " - наибольшая цифра - ");
        int a = Character.getNumericValue(x.charAt(0));
        int b = Character.getNumericValue(x.charAt(1));
        int c = Character.getNumericValue(x.charAt(2));
        if (a > b && a > c) {
            System.out.print(a);
        }
        if (b > a && b > c) {
            System.out.print(b);
        }
        if (c > a && c > b) {
            System.out.print(c);
        }
    }
}
