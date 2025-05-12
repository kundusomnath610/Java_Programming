package org.example.String;

public class Student {
    int roll;
    String name;
    
    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit");
        Student s2 = new Student(1, "Amit");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println(s1.equals(s2));
    }
}
