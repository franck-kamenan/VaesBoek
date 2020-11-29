package be.intecbrussel.hoofdstuk6;

public class ClassStringBuilder {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Hello World");
        StringBuilder texte = new StringBuilder("Hello World");
        StringBuilder tekst = text;
        System.out.println(text);
        System.out.println(text.equals(texte));
        System.out.println(text.equals(tekst));
        System.out.println(text.append(" of machines"));
        System.out.println(text.charAt(1));
        text.setCharAt(4, 'a');
        System.out.println(text);
        System.out.println(text.deleteCharAt(4));
        System.out.println(text.indexOf("o"));
        System.out.println(text.length());
        System.out.println(text.replace(4, text.length(), " Cyber World"));
        System.out.println(text.toString());
        System.out.println(text.substring(5, 10));
        System.out.println(text.reverse());
        System.out.println(text.reverse());
        System.out.println(text.insert(4, "ish"));

    }
}
