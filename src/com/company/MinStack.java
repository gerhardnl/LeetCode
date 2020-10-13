package com.company;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minValue = new Stack<>();

    public void push(int x) {
        if (minValue.isEmpty() || minValue.peek() > x) {
            minValue.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.peek().equals(minValue.peek())) {
            minValue.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minValue.peek();
    }
}