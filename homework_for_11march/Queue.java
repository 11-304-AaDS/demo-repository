package ru.itis.queuebystack;

import java.util.Stack;

public class Queue<T> implements IQueue<T>{

    Stack<T> current;
    Stack<T> helper;

    public Queue() {
        current = new Stack<>();
        helper = new Stack<>();
    }

    @Override
    public void push(T e) {
        current.push(e);
    }

    @Override
    public T pop() {
        if (!helper.isEmpty()) return helper.pop();
        while (!current.isEmpty()) {
            helper.push(current.pop());
        }
        return helper.pop();
    }

    @Override
    public boolean isEmpty() {
        if (!helper.isEmpty()) return helper.isEmpty();
        return current.isEmpty();
    }

    @Override
    public T peek() {
        if (!helper.isEmpty()) return helper.peek();
        while (!current.isEmpty()) {
            helper.push(current.peek());
        }
        return helper.peek();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "current=" + current +
                ", helper=" + helper +
                '}';
    }
}
