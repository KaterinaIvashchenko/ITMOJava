package NewEx;


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
