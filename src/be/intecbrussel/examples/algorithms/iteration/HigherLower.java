package be.intecbrussel.examples.algorithms.iteration;

import java.util.Random;
import java.util.Scanner;

public class HigherLower {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10);

        System.out.println("Enter a number:");

        boolean guessed = false;
        while (!guessed) {

            int guess = keyboard.nextInt();
            if (guess < numberToGuess){

                System.out.println("Higher!");
            } else {

                if (guess > numberToGuess){

                    System.out.println("Lower!");
                } else {

                    System.out.println("Guessed");
                    guessed = true;
                }
            }
        }

        keyboard.close();
    }
}
