/**
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
 * отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
 * Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
 */
public class Task1 {
    public static void main(String[] args) {
        String[] cupboard = new String[10];
        int j = 0;
        for (int i = 2; i < 21; i = i + 2) {
            cupboard[j] = Integer.toString(i);
            j++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(cupboard[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(cupboard[i] + " ");
        }
    }
}
