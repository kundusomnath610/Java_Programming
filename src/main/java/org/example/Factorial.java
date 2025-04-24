package org.example;

import java.util.Scanner;

public class Factorial { // through while loop
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int number = scanner.nextInt();
        int fact = 1;

        // while (number > 0) {
        //     fact = number * fact;
        // }
                for (int i = number; i >= 1; i--) {
                    fact = fact * i;
                }
        
         System.out.println("The factorial is number is :" + fact);
         scanner.close();
    }
}
