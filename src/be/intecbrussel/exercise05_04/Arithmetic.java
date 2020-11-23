package be.intecbrussel.exercise05_04;

public class Arithmetic {

    public static void main(String[] args) {

        int value1 = 5;
        int value2 = 3;
        int value3 = 4;

        System.out.println(((value1 < value2) ? value1: value2));
        System.out.println(((value1 < value3) ? value1: value3));
        System.out.println(((value2 < value1) ? value2: value1));
        System.out.println(((value2 < value3) ? value2: value3));
        System.out.println(((value3 < value1) ? value3: value1));
        System.out.println(((value3 < value2) ? value3: value2));
    }
}
