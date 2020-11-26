package be.intecbrussel.examples.algorithms.iteration;

public class PancakesFor {

    public static void main(String[] args) {

        System.out.println("Take flour");
        System.out.println("Add milk");
        System.out.println("Add eggs");
        System.out.println("Mix ingredients");

        for (int count = 0; count < 4; count++){

            System.out.println("Bake pancake " + count);
            System.out.println("Eat pancake " + count);
        }
    }
}
