package ru.itis.AaDS.queueWithTwoStack;

import java.util.Deque;
import java.util.LinkedList;

public class TwoStackQueue<T> {
    private Deque<T> stack1;
    private Deque<T> stack2;

    public TwoStackQueue() {
        this.stack1 = new LinkedList<>();
        this.stack2 = new LinkedList<>();
    }

    private void pourStack() { //переворачиваем из 1 в 2
        while (stack1.isEmpty() == false) {
            stack2.push(stack1.pop());
        }
    }

    public T pop() {
        if (this.isEmpty()) {
            throw new NullPointerException();
        } else {
            if (stack2.isEmpty()) {
                pourStack();
            }

            T temp = stack2.pop();
            return temp;
        }

    }

    public void push(T value) {
        stack1.push(value);
    }

    public boolean isEmpty() {
        if (stack1.isEmpty() & stack2.isEmpty()) {
            return true;
        }
        return false;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NullPointerException();
        } else {
            if (stack2.isEmpty()) {
                pourStack();
            }


            return stack2.peek();
        }
    }

    public String toString() {
        Deque<T> demoStack1 = new LinkedList<>(stack1);
        Deque<T> demoStack2 = new LinkedList<>(stack2);

        String str = "";
        while (demoStack2.isEmpty() == false) {
            str = str + demoStack2.pop() + " ";
        }
        while (demoStack1.isEmpty() == false) {
            demoStack2.push(demoStack1.pop());
        }

        while (demoStack2.isEmpty() == false) {
            str = str + demoStack2.pop() + " ";
        }
        return str;
    }


}
