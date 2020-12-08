package be.intecbrussel.hoofdstuk18;

public class TextPrinter {

    private String sentence;

    public TextPrinter(String sentence) {

        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter) {

        for (String i: sentence.split(" ")) {

            if (filter.isValid(i)) {

                System.out.println(i);
            }
        }

    }
}
