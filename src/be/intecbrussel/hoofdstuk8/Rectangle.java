package be.intecbrussel.hoofdstuk8;

public class Rectangle {

    private int x;
    private int y;
    private int height;
    private int width;

    public Rectangle() {

    }

    public Rectangle(int height, int width) {

        setWidth(width);
        setHeight(height);
    }

    public void setPosition(int xpos, int ypos){

        x = xpos;
        y = ypos;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public double getArea() {

        return height * width;
    }

    public double getPerimeter() {

        return 2 * (height + width);
    }

    public int getX() {

        return x;
    }

    public int getY() {

        return y;
    }

    public int getHeight() {

        return height;
    }

    public int getWidth() {

        return width;
    }
}
