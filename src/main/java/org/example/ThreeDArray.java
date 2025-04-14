package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Step 2 & 3: Create and populate the array
        int[] original = new int[size];
        System.out.print("Enter " + size + " digits (no spaces): ");
        String input = scanner.next();

        for (int i = 0; i < size; i++) {
            original[i] = Character.getNumericValue(input.charAt(i));
        }

        // Copy for reversal
        int[] reversed = new int[size];
        for (int i = 0; i < size; i++) {
            reversed[i] = original[size - 1 - i];
        }

        // Step 5: Print arrays
        System.out.println("Original array: " + Arrays.toString(original));
        System.out.print("Reversed array: [");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
            if (i < reversed.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        scanner.close();
    }    
}




/*
 * 
 * int[][][] array = new int[2][4][5];

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
 * 
 */