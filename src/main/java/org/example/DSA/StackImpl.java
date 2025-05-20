package org.example.DSA;

import java.util.ArrayList;

public class StackImpl {
    public static void main(String[] args) {

       
    }

    int top = -1;
    int[] stack;
    int capacity = 5;

    public void push(int num) {
        if (top < (capacity - 1)) {
            top++;
            stack[top] = num;
        } else {
            System.out.println("Cannot push, Max capacity reached");
        }
    }

    public int pop() {
        if (top >= 0) {
            int ele = stack[top];
            top--;
            return ele;
        } else {
            System.out.println("Stack is empty..");
            return -1;
        }
    }
}
