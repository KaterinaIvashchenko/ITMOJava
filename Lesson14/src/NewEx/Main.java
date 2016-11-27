package NewEx;


/**
 * Created by katerina on 11/25/16.
 */

public class Main {

    public static void main(String[] args) {
        ClassA ins = new ClassC();
       try {
           ins.f();
       } catch (ExсeptionLevelOne e) {
           e.printStackTrace();
       }
    }
}
