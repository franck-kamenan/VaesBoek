package be.intecbrussel.hoofdstuk17;

public class DuoApp {

    public static void main(String[] args) {

        Duo<String> sd = new Duo<String>("Hello ", "World");
        Duo<Integer> id = new Duo<Integer>(7, 3);

        System.out.println(sd.getFirst() + sd.getSecond());
        System.out.println(id.getFirst() + " and " + id.getSecond());
    }
}
