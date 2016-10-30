/**
 * В переменной n хранится натуральное двузначное число.
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 33;
        String s = Integer.toString(n);
        int result = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1));
        System.out.print(result);
    }
}
