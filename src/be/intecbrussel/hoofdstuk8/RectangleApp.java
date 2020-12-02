package be.intecbrussel.hoofdstuk8;

public class RectangleApp {

    public static void main(String[] args) {

        System.out.println("This program uses a rectangle");
        Rectangle rect = new Rectangle(7, 9, 5, 10);
        Rectangle secondRect = new Rectangle(rect);
        double area = rect.getArea();
        System.out.println("The area is: " + area);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getWidth());
        System.out.println(rect.getHeight());
        System.out.println(rect.getX());
        System.out.println(rect.getY());
    }
}
