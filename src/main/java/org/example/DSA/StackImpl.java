package org.example.DSA;

import java.util.ArrayList;

public class StackImpl {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        System.out.println(al);

        al.remove(20);
        al.remove(30);
        al.remove(40);
    }
}
