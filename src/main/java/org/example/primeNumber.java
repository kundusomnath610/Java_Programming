package org.example;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int start = scn.nextInt();
        int end = scn.nextInt();
        for (int i = start; i <= end; i++) {
            int factor = 0;
            for (int j = 1; j <= (i / 2); j++) {
                if (i % j == 0) {
                    factor++;
                }
            }
            if (factor == 1)
                System.out.println(i);
        }
    }
}









///////////////// logic of prime number.......
// if (factor == 2) {
//        System.out.println(number + " is prime.");
//        } else {
//                System.out.println(number + " is not prime.");
//        }