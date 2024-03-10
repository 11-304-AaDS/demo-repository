package ru.itis.aisd304.aisddz2;
import java.util.Stack;

public class QueueByTwoStacks<T> {

    private Stack<T> stack1;
    private Stack<T> stack2;

    public QueueByTwoStacks(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(T element){
        stack1.push(element);
    }

    public T pop(){
        if (!stack2.isEmpty()){
            return stack2.pop();
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public T peek(){
        if (!stack2.isEmpty()){
            return stack2.peek();
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }
    public boolean empty(){
        if (!stack2.isEmpty()){
            return stack2.isEmpty();
        }
        return stack1.isEmpty();
    }
    @Override
    public String toString(){
        return "Queue{" +
                " stack1 = " + stack1 +
                ", stack2 = " + stack2 + "}";
    }

}
