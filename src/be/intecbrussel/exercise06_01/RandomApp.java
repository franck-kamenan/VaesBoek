package be.intecbrussel.exercise06_01;

import java.util.Random;

public class RandomApp {

    public static void main(String[] args) {

        Random generator = new Random();
        int number1 = generator.nextInt(45);
        int number2 = generator.nextInt(45);
        int number3 = generator.nextInt(45);
        int number4 = generator.nextInt(45);
        int number5 = generator.nextInt(45);
        int number6 = generator.nextInt(45);
        System.out.println("Lotto: " + number1 + " " + number2 + " " + number3 + " " + number4 + " "
                + number5 + " " + number6);
    }
}
