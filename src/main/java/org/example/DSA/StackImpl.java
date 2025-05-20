package org.example.DSA;

import java.util.ArrayList;

public class StackImpl {
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10); // 1
        al.add(20); // 2
        al.add(30); // 3
        al.add(40); // 4
        al.add(50); // 5
        al.add(60); // 6

        System.out.println(al);

       
        al.remove(5);
        al.remove(2);


        System.out.println(al);
        System.out.println(al.size());
    }
}
