package org.example;

public class javaStatic {

    static int a = 10;
    static int b;
    static int c = 20;

    static  {
        System.out.println("static 1 exe");
    }

    static  {
        System.out.println("static 2 exe");
    }

    static {
        System.out.println("static 3 exe");
    }

    public static void fun () {
        System.out.println("static method exe");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void fun1 () {
        System.out.println("static1 method exe");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        System.out.println("Main () method call");
        javaStatic.fun();
        javaStatic.fun1();
    }
}
