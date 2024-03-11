package queueOnStacks;

import java.util.Stack;

public class QueueOnStacks <T> implements queueOnStacksInterface <T> {

    Stack<T> stackIn;
    Stack<T> stackOut;

    public QueueOnStacks() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }


    @Override
    public void push(T x) {
        stackIn.push(x);
    }

    @Override
    public T peek() {
        if (!stackOut.isEmpty()) {
            return stackOut.peek();
        }
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.peek();
    }
    public boolean empty() {
        if (!stackOut.isEmpty()) {
            return stackOut.isEmpty();
        }
        return stackIn.isEmpty();
    }
    public T pop() {
        if (!stackOut.isEmpty()) {
            return stackOut.pop();
        }
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop());
        }
        return stackOut.pop();
    }
}
