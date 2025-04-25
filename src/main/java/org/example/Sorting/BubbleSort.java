package org.example.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array Number:- ");
        int n = sc.nextInt();
        System.out.println("Enter a Array:- ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < (array.length - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("The Bubble sort is: " + array[i] + " ");
        }
        
        sc.close();
    }
}
