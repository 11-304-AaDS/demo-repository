package Practic4HW;

import java.util.Stack;

public class MyQueue<T> {
    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    public void push(T e) {
        stack1.push(e);
    }

    public T pop() {
        int stack1Size = stack1.size();
        if (!this.isEmpty()) {
            if (!stack2.isEmpty()) {
                return stack2.pop();
            } else {
                for (int i = 0; i < stack1Size; ++i) {
                    stack2.push(stack1.pop());
                }
                return stack2.pop();
            }
        }
        return null;
    }
    public T peek() {
        int stack1Size = stack1.size();
        if (!this.isEmpty()) {
            if (!stack2.isEmpty()) {
                return stack2.peek();
            } else {
                for (int i = 0; i < stack1Size; ++i) {
                    stack2.push(stack1.pop());
                }
                return stack2.peek();
            }
        }
        return null;
    }

    public boolean isEmpty() {
        if (stack1.isEmpty() & stack2.isEmpty()) {
            return true;
        }
        return false;
    }
}
