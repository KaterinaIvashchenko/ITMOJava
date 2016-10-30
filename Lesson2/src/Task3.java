/**
 * Cоздать программу, которая будет находить и выводить на экран вещественные корни
 * квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
 */
public class Task3 {
    public static void main(String[] args){
        int a = 2;
        int b = 8;
        int c = 3;
        int d = b * b + 4 * a * c;
        if (d < 0){
            System.out.println("Корней нет.");
        } else if(d == 0){
            double x = (-b + Math.sqrt(d))/(2 * a);
            System.out.println(x);
        } else {
            double x = (-b + Math.sqrt(d))/(2 * a);
            double y = (-b - Math.sqrt(d))/(2 * a);
            System.out.println(x + " и " + y);
        }
    }
}
