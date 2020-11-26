package be.intecbrussel.examples.algorithms.selection;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your weight in KG:");
        double weight = keyboard.nextDouble();
        System.out.println("Enter your height in CM:");
        double height = keyboard.nextDouble() / 100;
        double heightSquared = height * height;
        double bodyMassIndex = weight / heightSquared;

        if (bodyMassIndex < 20) {

            System.out.println("ondergewicht");
        } else if (bodyMassIndex >= 20 && bodyMassIndex < 25) {

            System.out.println("OK");
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {

            System.out.println("overgewicht");
        } else if (bodyMassIndex >= 30 && bodyMassIndex < 40) {

            System.out.println("obesitas");
        }
        else if (bodyMassIndex >= 40) {

            System.out.println("ziekelijk overgewicht");
        }

        System.out.println(bodyMassIndex);

        keyboard.close();
    }
}
