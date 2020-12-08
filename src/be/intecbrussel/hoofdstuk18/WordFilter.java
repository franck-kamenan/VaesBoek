package be.intecbrussel.hoofdstuk18;

@FunctionalInterface
public interface WordFilter {

    public boolean isValid(String s);
}
