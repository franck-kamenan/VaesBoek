package be.intecbrussel.hoofdstuk9;

public class Owner {

    private String name;
    private Pet pet;

    public Owner() {

    }

    public Owner(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public Pet getPet() {

        return pet;
    }

    public void setPet(Pet pet) {

        this.pet = pet;
    }
}
