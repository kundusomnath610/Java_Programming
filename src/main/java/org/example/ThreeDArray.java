package org.example;

public class ThreeDArray {
    public static void main(String[] args) {
        int[][][] array = new int[2][4][5];

        array[0][0][0] = 21;
        array[0][0][1] = 27;
        array[0][0][2] = 76;

        array[1][0][0] = 20;
        array[1][0][1] = 22;
        array[1][0][2] = 72;

        array[0][0][0] = 23;
        array[0][0][1] = 65;
        array[0][0][2] = 90;

        array[1][0][0] = 37;
        array[1][0][1] = 88;
        array[1][0][2] = 93;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; i++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.println(array[i][j][k] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }    
}
