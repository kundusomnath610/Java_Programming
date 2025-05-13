package org.example.DSA;

import java.util.ArrayList;

public class compearableInterface {
    public static void main(String[] args) {
        ArrayList<Object> list  = new ArrayList<>();
    }

    class Student implements Comparable {
        int roll;
        String name;
        float cgpa;

        public Student (int roll, String name, float cgpa) {
            this.roll = roll;
            this.name = name;
            this.cgpa = cgpa;
        }

        @Override
        public String toString() {
            return "Student [roll=" + roll + ", name=" + name + ", cgpa=" + cgpa + "]";
        }

        @Override
        public int compareTo(Object o) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        }
    }
}



