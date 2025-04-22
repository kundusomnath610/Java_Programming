package org.example;

import java.util.Scanner;

public class LinearArray {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter a array:");
        int n = scn.nextInt();

        int[] array = new int[n];
        System.out.println("Enter array element");

        // populate the array...
        for (int i = 0; i < array.length; i++) {
            array[i] = scn.nextInt();
        }

        System.out.println("Please enter a element to search");
        int key = scn.nextInt();
        boolean found = false;

        // Logic to find the array element...
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                found = true;
                System.out.println("Element found at indx in: " + i);
            }
        }
        if (found == false) 
            System.out.println("Element not found...");

        scn.close();
    }
}
