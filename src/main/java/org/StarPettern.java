package org;

import java.util.Scanner;

public class StarPettern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println();
        
        for(int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}


/*
 * 
 * for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scn.close();
 * 
 */