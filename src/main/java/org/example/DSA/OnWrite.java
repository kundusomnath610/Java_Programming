package org.example.DSA;

import java.util.concurrent.CopyOnWriteArrayList;

public class OnWrite {
    public static void main(String[] args) {
        
        CopyOnWriteArrayList list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (Object o : list) {
            System.out.println(o);

            list.add(99);
        }

        System.out.println(list);

    }
}
