package org.example.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class UsingAddFirstInList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Task Number: ");
        int n = scn.nextInt();
        scn.nextLine();

        LinkedList list = new LinkedList();
        for (int i = 1; i <= n; i++) {
            String str = scn.nextLine();
            list.addFirst(str);
        }

        System.out.println("Number of task: " + list.size());
        System.out.println("Tasks: ");
        for (Object o : list) {
            System.out.println(o);
        }

        scn.close();
    }
}
