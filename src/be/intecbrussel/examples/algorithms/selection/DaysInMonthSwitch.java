package be.intecbrussel.examples.algorithms.selection;

import java.util.Scanner;

public class DaysInMonthSwitch {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of the month:");
        int month = keyboard.nextInt();
        int days = 0;

        switch (month) {

            default: days = 0; break;
            case 2: days = 28; break;
            case 4:
            case 6:
            case 9:
            case 11: days = 30; break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31; break;
            }

        System.out.println("Number of days in month: " + days);

        keyboard.close();
    }
}
