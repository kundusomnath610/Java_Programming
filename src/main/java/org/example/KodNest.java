package org.example;

public class KodNest {

    static {
        System.out.println("Static block executing");
    }

    {
        System.out.println("Non / static block exeute");
    }

    KodNest() {
        System.out.println("Constructor excuting");
    }

    public static void main(String[] args) {

        System.out.println("Main() Method excuting");

        KodNest k1 = new KodNest();
        // KodNest k2 = new KodNest();
        // KodNest k3 = new KodNest();

        
    }
}
