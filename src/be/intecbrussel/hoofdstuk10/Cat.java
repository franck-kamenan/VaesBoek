package be.intecbrussel.hoofdstuk10;

public class Cat extends Animal {

    public String name;

    public Cat() {

    }

    public Cat(String name) {

        this.name = name;
    }

    @Override
    public void move(){

        System.out.println("move like a cat");
    }

    @Override
    public void makeNoise(){

        System.out.println("meow");
    }

    public String toString() {

        return "This is a Cat object.";
    }
}
