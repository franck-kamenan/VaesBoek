package be.intecbrussel.hoofdstuk8;

public class RectangleApp {

    public static void main(String[] args) {

        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();
        rect.width = 10;
        rect.height = 5;
        rect.x = 3;
        rect.y = 2;
        System.out.println("width: " + rect.width);
        System.out.println("height: " + rect.height);
        System.out.println("position: " + rect.x + ", " + rect.y);

        System.out.println();

        Rectangle secondRect = new Rectangle();
        secondRect.width = 1;
        secondRect.height = 4;
        secondRect.x = 6;
        secondRect.y = 7;
        System.out.println("width: " + secondRect.width);
        System.out.println("height: " + secondRect.height);
        System.out.println("position: " + secondRect.x + ", " + secondRect.y);
    }
}
