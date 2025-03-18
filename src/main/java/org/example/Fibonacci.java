package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print("Enter the number of terms: ");
        int a = 0, b = 1;

        System.out.println("Fibonacci Series (Iterative):");
        while (a <= n) {
            System.out.print(a + " ");

            // Compute next term
            int temp = a + b;
            a = b;
            b = temp;
        }
        scn.close();
    }
}

