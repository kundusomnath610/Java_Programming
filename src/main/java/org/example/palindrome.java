package org.example;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int reverse = 0;
        int k = number;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (k == reverse) {
            System.out.println(k + " is palindrome number.");
        } else {
            System.out.println(k + " is not a palindrome number.");
        }
    }
}
