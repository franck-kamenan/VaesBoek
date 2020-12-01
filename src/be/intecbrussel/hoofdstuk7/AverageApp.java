package be.intecbrussel.hoofdstuk7;

public class AverageApp {

    public static double average(double... values){

        double total = 0;

        for (double i: values) {

            total += i;
        }

        double avg = 0;
        if (values.length != 0){

            avg = total/values.length;
        }

        return avg;
    }

    public static void main(String[] args) {

        System.out.println(average(3, 8, 6, 9));
        double[] values = {3, 8, 6, 9};
        System.out.println(average(values));
    }
}
