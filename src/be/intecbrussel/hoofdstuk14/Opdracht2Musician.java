package be.intecbrussel.hoofdstuk14;

public class Opdracht2Musician {

    public void play() {

        class Opdracht2Instrument {

            public void makeSound() {

                System.out.println("MOVE");
            }
        }

        Opdracht2Instrument microphone = new Opdracht2Instrument();
        microphone.makeSound();
    }
}
