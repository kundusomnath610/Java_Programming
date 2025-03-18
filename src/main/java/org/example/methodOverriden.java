package org.example;

class parent {
    public void fun() {
        System.out.println("Parent fun");
    }
}

class child extends parent {
    public void fun() {
        System.out.println("Child fun1");
    }
}


public class methodOverriden {
    public static void main(String[] args) {
        parent p = new parent();
        p.fun();

        child c = new child();
        c.fun();

        parent ref = new parent();
        ref.fun();
    }
}
