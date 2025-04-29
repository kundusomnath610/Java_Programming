package org.example.Sorting.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("code");
        list.add(true);
        list.add(33.66f);


        for (Object i : list) {
            System.out.println(i);
        }
        System.out.println();

        Iterator itr = list.iterator();
        while (itr.hasNext()) 
            System.out.println(itr.next());
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
        System.out.println();

        System.out.println("The List is: " + list);
        System.out.println("The list size is: " + list.size());
    }
}
