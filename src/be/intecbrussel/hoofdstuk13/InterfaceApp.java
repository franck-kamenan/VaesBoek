package be.intecbrussel.hoofdstuk13;

public class InterfaceApp {

    public static void main(String[] args) {

        System.out.println(InterfaceInterface.CONSTANT);
        System.out.println(ImpClass.CONSTANT);
        InterfaceInterface.staticMethod();
        ImpClass impObject = new ImpClass();
        impObject.abstractMethod();
        impObject.defaultMethod();

        //Lambda test
        System.out.println("\n");

        InterfaceInterface lamdaObject = () -> System.out.println("Lambda");
        lamdaObject.abstractMethod();

    }
}
