package org.example;

import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;

        // Count the number of digits
        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num; // Reset temp to original number

        // Calculate sum of each digit raised to the power of 'digits'
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
    }
}

