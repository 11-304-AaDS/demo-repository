package queueOnStacks;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class QueueOnStacks <T> implements queueOnStacksInterface <T> {

    Stack<T> current;
    Stack<T> tmp;

    public QueueOnStacks() {
        current = new Stack<>();
        tmp = new Stack<>();
    }


    @Override
    public void push(T x) {
        current.push(x);
    }

    @Override
    public T peek() {
        if (!tmp.isEmpty()) {
            return tmp.peek();
        }
        while (!current.isEmpty()) {
            tmp.push(current.pop());
        }
        return tmp.peek();
    }
    public boolean empty() {
        if (!tmp.isEmpty()) {
            return tmp.isEmpty();
        }
        return current.isEmpty();
    }
    public T pop() {
        if (!tmp.isEmpty()) {
            return tmp.pop();
        }
        while (!current.isEmpty()) {
            tmp.push(current.pop());
        }
        return tmp.pop();
    }
}
