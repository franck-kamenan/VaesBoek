package be.intecbrussel.examples.algorithms.sequence;

import java.util.Scanner;

public class BmiUtility {

    public static float calculateBmi( float weight, float height){

        height = height / 100;
        float heightSquared = height * height;
        float bodyMassIndex = weight / heightSquared;
        return bodyMassIndex;
    }

    public static void printDiagnose(float bmi){

        System.out.println(bmi);
    }
}
