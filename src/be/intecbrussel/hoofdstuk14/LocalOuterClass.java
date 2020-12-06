package be.intecbrussel.hoofdstuk14;

public class LocalOuterClass {

    public void method() {

        final int CONST = 5;

        class LocalInnerClass {


        }

        LocalInnerClass inner = new LocalInnerClass();
    }
}
