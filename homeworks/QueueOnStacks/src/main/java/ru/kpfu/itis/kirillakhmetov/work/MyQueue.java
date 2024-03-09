package ru.kpfu.itis.kirillakhmetov.work;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue<T> {
    private final Deque<T> stackA;
    private final Deque<T> stackB;

    public MyQueue() {
        this.stackA = new LinkedList<>();
        this.stackB = new LinkedList<>();
    }

    public void push(T e) {
        stackA.push(e);
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        shiftStack();
        return stackB.peek();
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        shiftStack();
        return stackB.pop();
    }

    private void shiftStack() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
    }

    public boolean isEmpty() {
        return stackA.isEmpty() && stackB.isEmpty();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "stackA=" + stackA +
                ", stackB=" + stackB +
                '}';
    }
}
