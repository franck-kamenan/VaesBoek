package be.intecbrussel.hoofdstuk6;

public class Opdracht5 {

    public static void main(String[] args) {

        double feet = 3.28;

        for (double meter = 1; meter < 5; meter++) {

            System.out.format("%.2f meter = %.2f feet %n", meter,  (meter * feet));
        }

        System.out.println("\n");

        for (double meter = 0.5; meter < 5; meter += 0.5) {

            System.out.format("%.2f meter = %.2f feet %n", meter,  (meter * feet));
        }
    }
}
