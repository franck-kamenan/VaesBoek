package be.intecbrussel.hoofdstuk6;

public class Opdracht4 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Say hello to this world");
        System.out.println(stringBuilder);
        stringBuilder.delete(3, 4).delete(8, 9).delete(10, 11).delete(14, 15);
        System.out.println(stringBuilder);
    }
}
