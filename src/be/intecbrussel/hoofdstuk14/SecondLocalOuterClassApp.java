package be.intecbrussel.hoofdstuk14;

public class SecondLocalOuterClassApp {

    public static void main(String[] args) {

        SecondLocalOuterClass out = new SecondLocalOuterClass();
        out.getSecondLocalInnerClass()
                .toString();
    }
}
