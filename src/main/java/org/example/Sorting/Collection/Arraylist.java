package org.example.Sorting.Collection;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add("code");
        list.add(true);
        list.add(33.66f);

        System.out.println("The List is: " + list);
        System.out.println("The list size is: " + list.size());
    }
}
