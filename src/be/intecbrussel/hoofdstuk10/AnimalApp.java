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
        NukeDog felix = (int e) -> System.out.println("He has " + e + " eyes.");
        felix.howManyEyes(3);
        MyDog two = (String m, String j) -> System.out.println(m + " and " + j);
        two.names("Médor", "Judor");
        RageDog caligula = (int a, int b) -> a + b;
        System.out.println(caligula.victims(3, 5));
        PoopingDog who = (String s) -> s + " is the pooping dog.";
        System.out.println(who.poop("ratanplan"));
        
    }
}
