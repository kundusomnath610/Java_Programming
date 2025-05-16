package org.example.DSA;

import java.util.HashMap;

public class WeakMap {
    public static void main(String[] args) throws Exception {

        String obj1 = "Java";
        String obj2 = "Python";
        String obj3 = "C++";
        String obj4 = "Go Lang";

        HashMap map = new HashMap();
        map.put(1, obj1);
        map.put(2, obj2);
        map.put(3, obj3);
        map.put(4, obj4);

        System.out.println(map);

         obj1 = null;
        System.gc();
        Thread.sleep(3000);

        System.out.println(map);
        
    }
}
