package org.example.DSA;

import java.util.HashMap;

public class WeakMap {
    public static void main(String[] args) {

        String obj1 = "Java";
        String obj2 = "Python";
        String obj3 = "C++";

        HashMap map = new HashMap();
        map.put(1, obj1);
        map.put(2, obj2);
        map.put(3, obj3);

        System.out.println(map);

        obj1 = null;
        System.gc();
        System.out.println(map);
        
    }
}
