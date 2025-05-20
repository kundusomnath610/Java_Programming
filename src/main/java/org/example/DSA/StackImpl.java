package org.example.DSA;

import java.util.Scanner;

public class StackImpl {

    private int top = -1;
    private int[] stack;
    private int capacity;

    // Constructor to initialize stack
    public StackImpl(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
    }

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

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        StackImpl st = new StackImpl(5);

        while (true) {
            System.out.println("Enter a Operation");
            System.out.println("1 - For push \n 2 - For Pop \n 3 - For Print \n 4 - For Exit");
            int op = scn.nextInt();

            if (op == 4) {
                break;
            } else if (op == 1) {
                System.out.println("Enter a Number:");
                int num = scn.nextInt();
                st.push(num);
            } else if (op == 2) {
                System.out.println("Enter a number for pop");
                st.pop();
            } else if (op == 3) {
                st.printStack();
            }
        }
        scn.close();

    }
}
