package be.intecbrussel.hoofdstuk8;

public class ClassKlassenApp {

    public static void main(String[] args) {

        ClassKlassenmethoden classKlassenmethodenObject = new ClassKlassenmethoden();
        ClassKlassenmethoden.classMethod();
        classKlassenmethodenObject.classMethod();
        classKlassenmethodenObject.instanceMethod();
        System.out.println(ClassKlassenmethoden.classVariable);
        System.out.println(classKlassenmethodenObject.classVariable);
        System.out.println(classKlassenmethodenObject.instanceVariable);
    }
}
