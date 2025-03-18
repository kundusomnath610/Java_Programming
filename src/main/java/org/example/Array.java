package org.example;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] array = {10, 20, 30, 40};
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        scn.close();
    }
}
