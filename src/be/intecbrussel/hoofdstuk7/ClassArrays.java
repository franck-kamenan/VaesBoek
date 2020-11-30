package be.intecbrussel.hoofdstuk7;

public class ClassArrays {

    public static void main(String[] args) {

        int[] numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 6;
        numbers[3] = 8;
        int[] secondNumbers = {0, 1, 2, 3};
        int[] thirdNumbers;
        thirdNumbers = new int[] {0, 1, 2, 3};

        System.out.println(numbers[2]);
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }

        for (int i: numbers) {

            System.out.println(i);
        }
    }
}
