package be.intecbrussel.hoofdstuk10;

public class AnimalApp {

    public static void main(String[] args) {

        Animal myCat = new Cat();
        Animal mySnake = new Snake();

        myCat.move();
        myCat.makeNoise();

        mySnake.move();
        mySnake.makeNoise();
    }
}
