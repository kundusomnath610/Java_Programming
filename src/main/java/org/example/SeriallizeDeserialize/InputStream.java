package org.example.SeriallizeDeserialize;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputStream {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Please enter a Name");
        String name = br.readLine();

        System.out.println("Plaese enter the age...");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}
