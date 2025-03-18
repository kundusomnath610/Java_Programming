package org.example;

import java.util.Scanner;

public class java_calculator {

    // Method for addition
    public static int addition(int a, int b) {
        return a + b;
    }

    // Method for subtraction
    public static int subtraction(int a, int b) {
        return a - b;
    }

    // Method for multiplication
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Method for division
    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // Not a Number
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
        String operation = scn.next().toLowerCase();

        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();

        scn.close(); // Close scanner to avoid memory leaks

        switch (operation) {
            case "addition":
                System.out.println("The result of addition is: " + addition(num1, num2));
                break;

            case "subtraction":
                System.out.println("The result of subtraction is: " + subtraction(num1, num2));
                break;

            case "multiplication":
                System.out.println("The result of multiplication is: " + multiplication(num1, num2));
                break;

            case "division":
                double result = division(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("The result of division is: " + result);
                }
                break;

            default:
                System.out.println("Invalid operation. Please enter a valid operation.");
        }
    }
}

