package org.example.DSA;

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

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop()); // Output: 30
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.pop()); // Output: 10
        System.out.println(stack.pop()); // Output: Stack is empty..
    }
}
