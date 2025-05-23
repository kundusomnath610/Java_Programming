package org.example.ExceptionHandeling;

import java.io.IOException;

public class ExcepSql {
    public static void main(String[] args) throws IOException {
        Child ch = new Child();
        ch.fun();
    }
}

class Parent {
    public void fun() throws Exception {
        System.out.println("Parent Fun");
    }
}

class Child extends Parent {
    public void fun() throws IOException {
        System.out.println("Child fun");
    }
    
}
