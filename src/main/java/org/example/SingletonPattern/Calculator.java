package org.example.SingletonPattern;


public class Calculator {
    public static void main(String[] args) {
        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        Student s3 = Student.getStudent();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}

class Student {
    static Student st;
    private Student() {

    }
    public static Student getStudent() {
        if (st == null) 
            st = new Student();
        return st;
    }
}
