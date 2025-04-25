package org.example.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the number of elements in the array: ");
        int n = scn.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Take array elements input
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Selection Sort Algorithm
        for (int i = 0; i < n - 1; i++) {
            int minInd = i; // Assume the minimum element is at index i

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j; // Update index of the minimum element
                }
            }

            // Swap the found minimum element with the element at index i
            int temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }

        // Print the sorted array
        System.out.println("The sorted array using selection sort is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Close the scanner
        scn.close();
    }
}
