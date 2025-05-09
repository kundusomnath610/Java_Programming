package org.example.DSA;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a array:- ");
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("The array is duplicate is " + array[i] + ".");
            } else {
                System.out.println("this is not match.");
            }
        }
        scn.close();
    }
}

