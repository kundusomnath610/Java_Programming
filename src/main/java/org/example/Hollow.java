package org.example;

public class Hollow {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) { // outer loop
            for(int j = 1; j <= 5; j++) { // Inner Loop
                if (i == 1 || i == 5 || j == 1 || j == 5) { // Condition Check
                    System.out.print("*"); // print start
                } else {
                    System.out.print(" "); // print space
                }
            }
            System.out.println();
        }
    }
}
