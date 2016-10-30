/**
 * В переменной n хранится натуральное трёхзначное число.
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class Task4 {
    public static void main(String[] args) {
        int n = 386;
        String s = Integer.toString(n);
        int result = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1)) + Character.getNumericValue(s.charAt(2));
        System.out.print(result);
    }
}
