package NewEx;


public class ClassB extends ClassA {

    @Override
    void f() throws ExсeptionLevelOne {
        System.out.println(ClassB.class.getName() + " -> f()");
        throw new ExсeptionLevelTwo();
    }
}
