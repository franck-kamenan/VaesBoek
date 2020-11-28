package be.intecbrussel.examples.algorithms.sequence;

import java.util.Scanner;

public class MethodsSuite {

    public static void main(String[] args) {

        int n1 = SumUtility.readNumber();
        int n2 = SumUtility.readNumber();
        int s = SumUtility.sum(n1, n2);
        SumUtility.printSum(s);
    }

    /*public static int sum(int number1, int number2){

        int result = number1 + number2;
        return result;
    }*/

    /*public static int readNumber(){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = keyboard.nextInt();
        return number;
    }*/

    /*public static void printSum(int sum) {

        System.out.println("Sum: " + sum);
    }*/
}
