package QueueWithStacks;

import java.util.EmptyStackException;
import java.util.Stack;

public class QueueWithStacks<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    public void push(T element) {
        stack1.push(element);
    }

    public T pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public T peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) throw new EmptyStackException();
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() & stack2.isEmpty();
    }
}
