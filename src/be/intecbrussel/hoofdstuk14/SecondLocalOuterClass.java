package be.intecbrussel.hoofdstuk14;

public class SecondLocalOuterClass {

    public Object getSecondLocalInnerClass() {

        int a = 5;

        class SecondLocalInnerClass {

            public String toString() {

                return "SecondLocalInnerClass " + a;
            }
        }

        return new SecondLocalInnerClass();
    }
}
