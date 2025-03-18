package org.example;

public class number {
    public static void main(String[] args) {
        int n = 5;
//       for (int i = 5; i >= 1; i--) {
//           for (int j = 5; j >= i; j--) {
//               System.out.print(j + " ");
//           }
//           System.out.println();
//       }

        int rows = 9;
        int mid = rows / 2;

        for (int i = 0; i < rows; i++) {
            int spaces = Math.abs(mid - i);
            int stars = mid + 1 - spaces;

            // Print leading spaces
            System.out.print(" ".repeat(spaces));

            // Print asterisks with spaces
            System.out.println("* ".repeat(stars).trim());
        }
    }
}