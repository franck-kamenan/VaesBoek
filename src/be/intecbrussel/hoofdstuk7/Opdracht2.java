package be.intecbrussel.hoofdstuk7;

import java.util.Scanner;

public class Opdracht2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write some text:");
        String text = keyboard.nextLine();
        String[] words = text.split(" ");

        for (String i: words) {

            System.out.println(i);
        }
    }
}
