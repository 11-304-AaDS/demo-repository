package dz2;

import java.util.LinkedList;

public class Queue2<T> {
    LinkedList<T> st1 = new LinkedList<T>();
    LinkedList<T> st2 = new LinkedList<T>();

    public void push(T elem) {
        st1.push(elem);
    }

    public void pop() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        st2.pop();
    }

    public boolean isEmpty() {
        return st1.isEmpty() & st2.isEmpty();
    }

    public T peek() {
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }
}
