package be.intecbrussel.hoofdstuk15;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        try {

            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d / %d= %d", num, den, div);
            return;
        } catch (RuntimeException re) {

            System.out.println("Error.");
            System.out.println(re.getMessage());
        } finally {
            keyboard.close();
            System.out.println("\nThe End.");
        }
    }
}
