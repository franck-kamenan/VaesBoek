package be.intecbrussel.examples.algorithms.iteration;

public class Pancakes {

    public static void main(String[] args) {

        System.out.println("Take flour");
        System.out.println("Add milk");
        System.out.println("Add eggs");
        System.out.println("Mix ingredients");

        for (int count = 1; count < 11; count++) {

            System.out.println("Bake pancake " + count);
        }
    }
}
