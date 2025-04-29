package org.example.Sorting.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class AddElementToList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a list Size:- ");
        int n = scn.nextInt();
        ArrayList list = new ArrayList();


        // Add element to the list
        System.out.println("Enter a Number:- ");
        for (int i = 1; i <= n; i++) {
            int num = scn.nextInt();
            list.add(num);
        }

        //  For finding perticular index...
        System.out.println("Enter a Index number:- ");
        int index = scn.nextInt();

        System.out.println("Size is: " + list.size());
        System.out.print("Element is: ");
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();

        System.out.println("Element is " + index + " at :" + list.get(index) + ".");

        scn.close();
    }
}
