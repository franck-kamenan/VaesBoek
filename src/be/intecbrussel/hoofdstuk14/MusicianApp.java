package be.intecbrussel.hoofdstuk14;

public class MusicianApp {

    public static void main(String[] args) {

        Musician stefflonDon = new Musician();
        stefflonDon.play();

        Musician.Instrument radio = stefflonDon.new Instrument();
        radio.makeSound();
    }
}
