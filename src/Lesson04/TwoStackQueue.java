package Lesson04;

import java.util.LinkedList;

public class TwoStackQueue<T> {
    LinkedList<T> stack1 = new LinkedList<>();
    LinkedList<T> stack2 = new LinkedList<>();

    private void relocate() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
    public T pop() {
        if(isEmpty()) return null;
        relocate();
        return stack2.pop();
    }
    public void push(T value) {
        stack1.push(value);
    }
    public boolean isEmpty() {
        return stack1.isEmpty() & stack2.isEmpty();
    }
    public T peek() {
        if (isEmpty()) return null;
        relocate();
        return stack2.peek();
    }
}
