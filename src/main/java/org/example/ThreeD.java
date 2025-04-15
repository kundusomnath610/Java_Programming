package org.example;

import java.util.Scanner;

public class ThreeD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for dimensions
        int layer = scanner.nextInt();
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        // Declare the 3D array
        int[][][] Array = new int[layer][row][column];

        // Input elements into the 3D array
        for (int l = 0; l < layer; l++) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    Array[l][i][j] = scanner.nextInt();
                }
            }
        }

        System.out.println("3D Array:");

        for (int l = 0; l < layer; l++) {
            System.out.println("Layer " + (l + 1) + ":");

            int layerSum = 0;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(Array[l][i][j] + " ");
                    layerSum += Array[l][i][j];
                }
                System.out.println();
            }

            System.out.println("Sum of layer " + (l + 1) + ": " + layerSum);
        }

        scanner.close();
    }
}
