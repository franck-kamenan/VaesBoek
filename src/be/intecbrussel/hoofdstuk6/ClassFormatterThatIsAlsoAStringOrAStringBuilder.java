package be.intecbrussel.hoofdstuk6;

import java.util.Formatter;

public class ClassFormatterThatIsAlsoAStringOrAStringBuilder {

    public static void main(String[] args) {

        Formatter myFormatter = new Formatter();
        String text = "I'm %d years old and I'm %.2f m tall!";
        myFormatter.format(text,21, 1.75);
        System.out.println(myFormatter);

        System.out.println("----");
        System.out.println(myFormatter);
        System.out.println("xxx");
        System.out.printf("I'm %d years old and I'm %.2f m tall!",21, 1.75);
        System.out.println("\nxxx");
        System.out.format("I'm %d years old and I'm %.2f m tall!",21, 1.75);
        System.out.println("\n----");

        Formatter mySecondFormatter = new Formatter();
        mySecondFormatter.format("I'm %d years old and I'm %.2f m tall!",21, 1.75);
        System.out.println(mySecondFormatter);

        Formatter myThirdFormatter = new Formatter();
        myThirdFormatter.format("%b %c %d %.1f %s %n", true, 'a', 12, 45.2, "hello");
        System.out.println(myThirdFormatter);

        Formatter myFourthFormatter = new Formatter();
        myFourthFormatter.format("%1$b %2$c %3$d %4$.1f %5$s %n", true, 'a', 12, 45.2, "hello");
        System.out.println(myFourthFormatter);

        /*Index avec $:
        * b doit TOUJOURS être 1$*
        * c doit TOUJOURS être 2$*
        * d doit TOUJOURS être 3$*
        * f doit TOUJOURS être 4$*
        * s doit TOUJOURS être 5$*/

        Formatter myFifthFormatter = new Formatter();
        myFifthFormatter.format("%2$c %4$.1f %3$d %5$s %1$b %n", true, 'a', 12, 45.2, "hello");
        System.out.println(myFifthFormatter);

        Formatter mySixthFormatter = new Formatter();
        mySixthFormatter.format("%+d %,d %(d", 14, 1235, -15);
        System.out.println(mySixthFormatter);

        Formatter mySeventhFormatter = new Formatter();
        mySeventhFormatter.format("%-6d %.6f %06d", -14, 1.235, 15);
        System.out.println(mySeventhFormatter);

        myFormatter.close();
    }
}
