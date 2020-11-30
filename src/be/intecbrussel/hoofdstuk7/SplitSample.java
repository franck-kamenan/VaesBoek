package be.intecbrussel.hoofdstuk7;

public class SplitSample {

    public static void main(String[] args) {

        String text = "I just want to say hello!";
        String[] words = text.split(" ");

        for (String i: words) {

            System.out.println(i);
        }
    }
}
