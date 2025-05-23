package org.example.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class atmPin {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        final int MAX_ATTEMPTS = 3;

        Scanner scn = new Scanner(System.in);

        int attempts = 0;
        boolean success = false;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your PIN: ");
            try {
                int enteredPin = scn.nextInt();
                if (enteredPin == CORRECT_PIN) {
                    System.out.println("Successfully withdrew the money.");
                    success = true;
                    break;
                } else {
                    System.out.println("Incorrect PIN. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numeric PIN only.");
                scn.next(); // clear invalid input
            }
            attempts++;
        }

        if (!success) {
            System.out.println("Maximum attempts reached. Transaction failed.");
        }

        scn.close();
    }
}
