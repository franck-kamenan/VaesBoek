package be.intecbrussel.hoofdstuk14;

public class StaticApp {

    public static void main(String[] args) {

        StaticOuterClass.StaticInnerClass staticInnerClassObject = new StaticOuterClass.StaticInnerClass();
        staticInnerClassObject.dance();
    }
}
