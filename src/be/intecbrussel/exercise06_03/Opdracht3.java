package be.intecbrussel.exercise06_03;

public class Opdracht3 {

    public static void main(String[] args) {

        String tekst = "Een regel tekst.";
        System.out.println(tekst);
        System.out.println(tekst.length());
        System.out.println(tekst.toUpperCase());
        System.out.println(tekst.toLowerCase());
        System.out.println(tekst.replace('e', 'a'));

        String boss = "Avon Barksdale";
        String underBoss = "Stringer Bell";
        System.out.println(boss.equals(underBoss));

        String theWire = " HBO ";
        System.out.println(theWire);
        System.out.println(theWire.trim());
    }
}
