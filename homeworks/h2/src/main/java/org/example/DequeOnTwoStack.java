package org.example;

import java.util.EmptyStackException;
import java.util.Stack;

public class DequeOnTwoStack<T> {

    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    public DequeOnTwoStack() {}

    public void push(T value){
        stack1.push(value);
    }

    public T pop(){
        if (stack1.isEmpty() & stack2.isEmpty()) throw new EmptyStackException();
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() & stack2.isEmpty();
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

}
