package be.intecbrussel.hoofdstuk17;

public class MixedDuoApp {

    public static void main(String[] args) {

        MixedDuo<String, Integer> md = new MixedDuo<>("Hello World", 7);

        System.out.println(md.getFirst());
        System.out.println(md.getSecond());
    }
}
