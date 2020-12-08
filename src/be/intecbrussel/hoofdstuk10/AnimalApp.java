package be.intecbrussel.hoofdstuk10;

public class AnimalApp {

    public static void main(String[] args) {

        Animal myCat = new Cat();
        Animal mySnake = new Snake();

        Cat secondCat = new Cat();
        Snake secondSnake = new Snake();

        myCat.move();
        myCat.makeNoise();
        secondCat.move();
        secondCat.makeNoise();

        mySnake.move();
        mySnake.makeNoise();
        secondSnake.move();
        secondSnake.makeNoise();

        System.out.println(myCat instanceof Animal);
        System.out.println(secondCat instanceof Animal);
        System.out.println(mySnake instanceof Animal);
        System.out.println(secondSnake instanceof Animal);

        System.out.println(secondCat);
        System.out.println(myCat);

        //Lambda

        Dog totou = () -> System.out.println("woof");
        totou.makeNoise();
    }
}
