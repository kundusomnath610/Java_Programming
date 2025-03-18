package org.example;

public class bigDaimond {
    public static void main(String[] args) {
        int i, j,k = 0;
        int num = 1;
        for (i = 1; i <= 5; i++) {

            // Inner loop for columns
            for (j = 1; j <= i; j++) {

                // Printing value to be displayed
                System.out.print(num + "  ");

                // Incremeting value displayed
                num++;
            }
            for(k = 5; k >= 1; k--) {
                System.out.print(num + " ");
                num--;
            }
            // Print elements of next row
            System.out.println();
        }
    }
}
