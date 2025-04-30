package org.example.Sorting.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIndexElement {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Create a Arraylist
        ArrayList list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            String str = scn.next();
            list.add(str);
        }

        // Another Index to find the list
        int idx = scn.nextInt();
        String newString = scn.next();
        list.add(idx, newString);

        System.out.print("The Updated ArrayList is: ");
        for (Object o : list)
            System.out.print(o + " ");

        scn.close();
    }
}
