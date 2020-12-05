package be.intecbrussel.hoofdstuk10;

public class Snake extends Animal {

    public String name;

    public Snake() {

    }

    public Snake(String name) {

        this.name = name;
    }

    @Override
    public void move(){

        System.out.println("move like a snake");
    }

    @Override
    public void makeNoise(){

        System.out.println("hissss");
    }
}
