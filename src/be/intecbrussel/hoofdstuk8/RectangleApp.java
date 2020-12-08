package be.intecbrussel.hoofdstuk8;

import be.intecbrussel.MainTest;

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

        System.out.println();

        System.out.println(secondRect.getArea());
        System.out.println(secondRect.getPerimeter());
        System.out.println(secondRect.getWidth());
        System.out.println(secondRect.getHeight());
        System.out.println(secondRect.getX());
        System.out.println(secondRect.getY());

        System.out.println();

        System.out.println(ClassKlassenvariabelen.ANGLES);
        ClassKlassenvariabelen testy = new ClassKlassenvariabelen();
        System.out.println(testy.ANGLES);

        System.out.println();

        ClassKlassenmethoden.classMethod();
        ClassKlassenmethoden instance = new ClassKlassenmethoden();
        instance.classMethod();
        instance.instanceMethod();
        System.out.println(ClassKlassenmethoden.classVariable);
        System.out.println(instance.classVariable);
        System.out.println(instance.instanceVariable);

    }
}
