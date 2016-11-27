package NewEx;


public class ClassA {
    void f() throws ExсeptionLevelOne {
        System.out.println(ClassA.class.getName() + " -> f()");
        throw new ExсeptionLevelOne();
    }
}
