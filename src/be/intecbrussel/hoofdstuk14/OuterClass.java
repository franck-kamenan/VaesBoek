package be.intecbrussel.hoofdstuk14;

public class OuterClass {

    public class InnerClass {

        public void aMethod() {

            System.out.println("I am a method.");
        }
    }

        public void doSomething() {

            InnerClass inner = new InnerClass();
            inner.aMethod();
        }
}
