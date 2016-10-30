/**
 * В переменной n хранится вещественное число с ненулевой дробной частью.
 * Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
 */
public class Task3 {
    public static void main(String[] args) {
        double n = 10.5;
        System.out.println((int) Math.round(n));
    }
}
