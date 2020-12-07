package be.intecbrussel.hoofdstuk17;

public class DuoApp {

    public static void main(String[] args) {

        String s = "Hello World";
        Integer i = 7;

        Duo d = new Duo(s, i);
        System.out.println(d.getFirst());
        System.out.println(d.getSecond());
    }
}
