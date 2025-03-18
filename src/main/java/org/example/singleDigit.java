package org.example;

import java.util.Scanner;

public class singleDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int result = digit(number);
        while (result >= 10) {
            result = digit(result);
        }
        System.out.println("The single-digits sum of the " + number + " is " + result + ".");
    }

    public static int digit (int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}
