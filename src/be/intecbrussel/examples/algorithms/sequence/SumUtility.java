package be.intecbrussel.examples.algorithms.sequence;

import java.util.Scanner;

public class SumUtility {

    public static int sum(int number1, int number2){

        int result = number1 + number2;
        return result;
    }

    public static int readNumber(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = keyboard.nextInt();
        return number;
    }

    public static void printSum(int sum) {

        System.out.println("Sum: " + sum);
    }
}
