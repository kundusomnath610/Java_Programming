package org.example.DSA;

import java.util.ArrayList;

public class StackImpl {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10); // 1
        al.add(20); //
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        System.out.println(al);

        al.remove(2);
        al.remove(3);


        System.out.println(al);
        System.out.println(al.size());
    }
}
