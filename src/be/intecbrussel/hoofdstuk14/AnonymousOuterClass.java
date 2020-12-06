package be.intecbrussel.hoofdstuk14;

public class AnonymousOuterClass {

    public void method() {

        class AnonymousSubClass extends AnonymousSuperClass {

            @Override
            public void superClassMethod() {

                System.out.println("Super Class Method.");
            }
        }
        AnonymousSuperClass anonymousSubClassObject = new AnonymousSubClass();

        class AnonymousInterfaceClass implements AnonymousInterface {

            @Override
            public void interfaceMethod() {

                System.out.println("Interface Method.");
            }
        }
        AnonymousInterface anonymousInterfaceClassObject = new AnonymousInterfaceClass();
    }
}
