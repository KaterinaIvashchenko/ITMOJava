package NewEx;

//
public class ClassC extends ClassB {

    @Override
    void f() throws ExсeptionLevelOne {
        System.out.println(ClassC.class.getName() + " -> f()");
        throw new ExсeptionLevelThree();
    }
}
