package org.example;

class Parent {
    int a = 10;
    public void fun() {
        System.out.println("Parent - fun");
    }
}

class Child extends Parent {
    int a = 20;
    public void fun() {
        System.out.println("Child - fun");
    }
}




public class MainSu {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.fun();
    }
}
