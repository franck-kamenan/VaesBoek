package be.intecbrussel.examples.algorithms.sequence;

import java.util.Scanner;

public class KeyboardUtility {

    public static int readInt(){

        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
        return number;
    }
}
