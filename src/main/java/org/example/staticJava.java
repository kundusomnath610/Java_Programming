package org.example;


class staticDemo {
    // static variable
    static int x = 10;

    // static method
    public static void fun1() {
        System.out.println("Static method execute");
    }

    // Not static variable..
    int y = 20;

    // Not static method
    public void fun2 () {
        System.out.println("This is non static method");
    }
}



public class staticJava {
    public static void main(String[] args) {
        // Accessing static component
        System.out.println("X = " + staticDemo.x);
        staticDemo.fun1();


        // Access not static member
        staticDemo sd = new staticDemo();
        System.out.println("y = " + sd.y);
        sd.fun2();
    }
}
