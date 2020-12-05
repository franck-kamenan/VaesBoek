package be.intecbrussel.hoofdstuk10;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
