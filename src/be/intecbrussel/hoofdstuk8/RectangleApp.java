package be.intecbrussel.hoofdstuk8;

public class RectangleApp {

    public static void main(String[] args) {

        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();
        rect.width = 10;
        rect.height = 5;
        System.out.println(rect.width);
        System.out.println(rect.height);
    }
}
