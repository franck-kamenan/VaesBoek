package be.intecbrussel.hoofdstuk6;

public class ClassEquals {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Hello World");
        StringBuilder texte = new StringBuilder("Hello World");
        StringBuilder tekst = text;
        System.out.println(text);
        System.out.println(text.equals(texte));
        System.out.println(text.equals(tekst));

        text.append(". The machines are here.")
                .insert(17, "evil ");
        System.out.println(text);
        System.out.println(text.equals(tekst));
    }
}
