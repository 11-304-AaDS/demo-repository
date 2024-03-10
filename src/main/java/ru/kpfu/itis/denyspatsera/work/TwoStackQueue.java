package ru.kpfu.itis.denyspatsera.work;

import java.util.Stack;

@SuppressWarnings("unused")
public class TwoStackQueue<T> {

    private final Stack<T> stackIn = new Stack<>();
    private final Stack<T> stackOut = new Stack<>();

    public void push(T item) {
        stackIn.push(item);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        moveStackInToStackOut();
        return stackOut.pop();
    }

    private void moveStackInToStackOut() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
    }

    public boolean isEmpty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }
        moveStackInToStackOut();
        return stackOut.peek();
    }
}
