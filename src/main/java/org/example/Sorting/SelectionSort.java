package org.example.Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Array Number:- ");
        int minInd = scn.nextInt();

        System.out.println("Enter a Array Element:- ");
        int[] arr = new int[minInd];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
                int temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = temp;
            }
        }

        for (int i = 0; i < minInd; i++) {
            System.out.println("The selection sort is: " + arr[i] + " ");
        }
        scn.close();
    }
}
