package org.example.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Array Number:- ");
        int n = scn.nextInt();

        System.out.println("Enter a Array Element:- ");
        int[] Array = new int[n];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = scn.nextInt();
        }

        for (int i = 0; i < Array.length; i++) {
            int key = Array[i];
            int j = i - 1;

            while (j >= 0 && Array[i] > key) {
                Array[j + 1] = Array[j];
                j--;
            }

            Array[j + 1] = key;
        }
        
        System.out.println();

        System.out.println("The Sorted Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }

        scn.close();

    }
}
