package be.intecbrussel.hoofdstuk10;

public class Square extends Rectangle9 {

    private int side;
    private int x;
    private int y;
    public final String DESCRIPTION = "Square";
    public final String SECONDDESCRIPTION =super.DESCRIPTION + " (Square) ";

    public Square() {

    }

    public Square(int side, int x, int y) {

        this.side = side;
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {

        return side * side;
    }

    @Override
    public double getPerimeter() {

        return side * 4;
    }

    public int getSide() {

        return side;
    }

    @Override
    public int getX() {

        return x;
    }

    @Override
    public int getY() {

        return y;
    }

    @Override
    public void setPosition( int x, int y) {

        this.x = x;
        this.y = y;
    }
}
