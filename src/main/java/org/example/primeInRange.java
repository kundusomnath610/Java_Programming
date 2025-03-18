package org.example;

import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int start = scn.nextInt();
        int end = scn.nextInt();

        System.out.println("The prime number range from " + start + " to " + end + " is:");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
        scn.close();
    }

    public static boolean isPrime (int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
