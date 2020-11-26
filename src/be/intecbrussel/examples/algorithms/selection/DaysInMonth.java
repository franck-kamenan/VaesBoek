package be.intecbrussel.examples.algorithms.selection;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of the month:");
        int month = keyboard.nextInt();
        int days;

        if (month == 1) {

            days = 31;
        } else if (month == 2) {

            days = 28;
        } else if (month == 3) {

            days = 31;
        } else if (month == 4) {

            days = 30;
        } else if (month == 5) {

        days = 31;
        } else if (month == 6) {

        days = 30;
        } else if (month == 7) {

        days = 31;
        } else if (month == 8) {

        days = 31;
        } else if (month == 9) {

        days = 30;
        } else if (month == 10) {

        days = 31;
        } else if (month == 11) {

        days = 30;
        } else if (month == 12) {

        days = 31;
        } else {

            days = 0;
        }

        System.out.println("Number of days in month: " + days);

        keyboard.close();
    }
}
