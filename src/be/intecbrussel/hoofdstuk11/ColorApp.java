package be.intecbrussel.hoofdstuk11;

public class ColorApp {

    public static void main(String[] args) {

        Color myColor = Color.RED;
        Color secondColor = Color.GREEN;
        Color thirdColor = Color.valueOf("BLUE");
        System.out.println(myColor);
        System.out.println(secondColor);
        System.out.println(thirdColor);
        System.out.println(myColor.name());
        System.out.println(secondColor.ordinal());
    }
}
