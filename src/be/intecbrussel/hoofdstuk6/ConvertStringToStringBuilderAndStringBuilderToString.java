package be.intecbrussel.hoofdstuk6;

public class ConvertStringToStringBuilderAndStringBuilderToString {

    public static void main(String[] args) {

        String string = "Hello World";
        System.out.println(string);
        StringBuilder stringConvertedToStringBuilder = new StringBuilder(string);
        System.out.println(stringConvertedToStringBuilder);
        String stringBuilderConvertedToString = stringConvertedToStringBuilder.toString();
        System.out.println(stringBuilderConvertedToString);
    }
}
