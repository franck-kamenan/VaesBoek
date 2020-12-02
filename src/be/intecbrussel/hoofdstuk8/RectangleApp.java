package be.intecbrussel.hoofdstuk8;

public class RectangleApp {

    public static void main(String[] args) {

        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle();
        rect.width = 10;
        rect.height = 5;
        rect.setPosition(7, 9);
        double area = rect.getArea();
        System.out.println("The area is: " + area);
    }
}
