package be.intecbrussel.hoofdstuk14;

public class OuterClassApp {

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.aMethod();
        outer.doSomething();
    }
}
