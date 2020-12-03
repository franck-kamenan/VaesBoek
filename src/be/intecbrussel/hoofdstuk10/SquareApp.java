package be.intecbrussel.hoofdstuk10;

public class SquareApp {

    public static void main(String[] args) {

        Square squareObject = new Square();
        Rectangle9 rectangle9Object = new Square();
        Square sq = new Square(5, 6, 7);

        System.out.println(squareObject.DESCRIPTION);
        System.out.println(rectangle9Object.DESCRIPTION);
        System.out.println(squareObject.SECONDDESCRIPTION);

        System.out.println(sq.getArea());
        System.out.println(sq.getPerimeter());
        System.out.println(sq.getSide());
        System.out.println(sq.getX());
        System.out.println(sq.getY());

        sq.setPosition(8, 9);
        System.out.println(sq.getX());
        System.out.println(sq.getY());
    }
}
