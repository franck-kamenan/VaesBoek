package be.intecbrussel.hoofdstuk13;

public interface InterfaceInterface {

    public static final int CONSTANT = 50;

    public abstract void abstractMethod();

    public default void defaultMethod() {

        System.out.println("Default Method.");
    }

    public static void staticMethod() {

        System.out.println("Static Method.");
    }
}
