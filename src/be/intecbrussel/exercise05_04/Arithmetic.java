package be.intecbrussel.exercise05_04;

public class Arithmetic {

    public static void main(String[] args) {

        int value1 = 5;
        int value2 = 3;

        int abs = (value1 > 9) ? value1 * 10 : value1 * 100;
        System.out.println(abs);

        System.out.println(((value1 > 9) ? "It is true": "it is false"));
    }
}
