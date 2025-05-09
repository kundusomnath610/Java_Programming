package org.example.DSA;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();
        int[] array = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }

        Arrays.sort(array);

        boolean hasDuplicates = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                // Print only the first occurrence of each duplicate
                if (i == 0 || array[i] != array[i - 1]) {
                    System.out.println("Duplicate element found: " + array[i]);
                    hasDuplicates = true;
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }

        scn.close();
    }
}
