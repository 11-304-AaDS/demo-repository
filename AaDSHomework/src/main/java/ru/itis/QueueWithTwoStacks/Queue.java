package ru.itis.QueueWithTwoStacks;

import java.util.Stack;

public class Queue<T> implements IQueue<T> {
    private Stack<T> s1;
    private Stack<T> s2;

    Queue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    @Override
    public void push(T e) {
        s1.push(e);
    }

    @Override
    public T pop() {
        if (!s2.isEmpty()) {
            return s2.pop();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    @Override
    public boolean isEmpty() {
        if (!s2.isEmpty()) {
            return false;
        }
        return s1.isEmpty();
    }

    @Override
    public T peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "s1=" + s1 +
                ", s2=" + s2 +
                '}';
    }
}
