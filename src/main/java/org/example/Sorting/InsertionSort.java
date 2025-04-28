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
            
        }
        
    }
}
