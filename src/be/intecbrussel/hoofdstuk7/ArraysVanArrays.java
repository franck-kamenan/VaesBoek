package be.intecbrussel.hoofdstuk7;

public class ArraysVanArrays {

    public static void main(String[] args) {

        int[][] array2d = {{3, 6, 7}, {2, 1}, {8, 0, 5, 4}};
        int[][] secondArray2d = new int[2][];
        secondArray2d[0] = new int[3];
        secondArray2d[1] = new int[2];
        secondArray2d[0][0] = 3;
        secondArray2d[0][1] = 6;
        secondArray2d[0][2] = 7;
        secondArray2d[1][0] = 2;
        secondArray2d[1][1] = 1;
        int[][] thirdArray2d = new int[4][6];
        int[][][] Array3d = new int[9][5][7];

        for (int i = 0; i < array2d.length; i++) {

            for (int j = 0; j < array2d[i].length; j++) {

                System.out.println(array2d[i][j]);
            }
        }

        System.out.println("\n");

        for (int[] i: array2d) {

            for (int j: i) {

                System.out.println(j);
            }
        }
    }
}
