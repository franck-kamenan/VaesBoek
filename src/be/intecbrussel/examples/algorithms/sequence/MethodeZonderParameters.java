package be.intecbrussel.examples.algorithms.sequence;

import java.util.Scanner;

public class MethodeZonderParameters {

    public static void main(String[] args) {

        int myNumber = readNumber();
        System.out.println(myNumber);
    }

    public static int readNumber(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = keyboard.nextInt();
        return number;
    }
}
