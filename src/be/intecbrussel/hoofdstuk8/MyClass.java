package be.intecbrussel.hoofdstuk8;

public class MyClass {

    int number = 5;
    public int publicNumber = 7;
    private int privateNumber = 8;

    public void aMethod(){

        int number = 6;
        int publicNumber = 9;
        int privateNumber = 10;

        System.out.println(number);
        System.out.println(publicNumber);
        System.out.println(privateNumber);

        System.out.println(this.number);
        System.out.println(this.publicNumber);
        System.out.println(this.privateNumber);
    }

    public static void main(String[] args) {

        MyClass myObject = new MyClass();
        myObject.aMethod();
    }
}
