package be.intecbrussel.hoofdstuk18;

public class TextApp {

    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence" +
                " containing words");

        System.out.println("*** Words containing 'e' ***");

        tp.printFilteredWords((String s) -> s.contains("e"));

        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.contains("e");
            }
        });

        System.out.println("\n*** Long words ***");

        tp.printFilteredWords((String s) -> s.length() > 7);

        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.length() > 7;
            }
        });

        System.out.println("\n*** Words starting with 'a' ***");

        tp.printFilteredWords((String s) -> s.startsWith("a"));

        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                return s.startsWith("a");
            }
        });
    }
}
