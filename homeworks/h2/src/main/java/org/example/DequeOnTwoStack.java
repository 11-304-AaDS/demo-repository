package org.example;

import java.util.EmptyStackException;
import java.util.Stack;

public class DequeOnTwoStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public DequeOnTwoStack() {}

    public void push(Integer value){
        stack1.push(value);
    }

    public Integer pop(){
        if (stack1.isEmpty() && stack2.isEmpty()) throw new EmptyStackException();
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack2.isEmpty();
    }
    
    public Integer peek() {
        if (stack2.isEmpty()) throw new EmptyStackException();
        return stack2.peek();
    }

}
