package be.intecbrussel.examples.algorithms.sequence;

public class Methods {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        int c = a + b;

        System.out.println(c);
        System.out.println(sum(a, b));
        System.out.println("\n");

        int d = 7;
        int e = 8;
        int f = d + e;

        System.out.println(f);
        System.out.println(sum(d, e));
        System.out.println("\n");

        c = sum(a, b);
        f = sum(d, e);

        System.out.println(c);
        System.out.println(f);
        System.out.println("\n");

        System.out.println("\n");
    }

    public static int sum(int number1, int number2){

        int result = number1 + number2;
        return result;
    }
}
