package be.intecbrussel.hoofdstuk14;

public class Musician {

    public class Instrument {

        public void makeSound() {

            System.out.println("MOVE");
        }
    }

    public void play() {

        Instrument microphone = new Instrument();
        microphone.makeSound();
    }
}
