package les4.StackQueue;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> first;
    Stack<Integer> second;
    public MyQueue(){
        first = new Stack<>();
        second = new Stack<>();
    }
    public void push(int a){
        first.push(a);
    }

    public int pop(){
        if (!second.isEmpty()){
            return second.pop();
        }
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        return second.pop();
    }

    public int peek(){
        if (!second.isEmpty()){
            return second.peek();
        }
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        return second.peek();
    }

    public boolean empty() {
        if (!second.isEmpty()) {
            return second.isEmpty();
        }
        return first.isEmpty();
    }
}
