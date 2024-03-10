package homework2;

import java.util.Stack;
public class Queue implements IQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;


    public Queue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    @Override
    public Integer pop() {
        if(!s2.isEmpty()) {
            return s2.pop();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    @Override
    public void push(Integer e) {
        s1.push(e);
    }

    @Override
    public boolean isEmpty() {
        if(!s2.isEmpty()){
            return false;
        }
        return s1.isEmpty();
    }

    @Override
    public Integer peek() {
        if(!s2.isEmpty()) {
            return s2.peek();
        }
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");

        for (Integer i : s2) {
            res.append(i).append(" ");
        }

        Stack<Integer> temp = new Stack<>();
        while (!s1.isEmpty()) {
            temp.push(s1.pop());
        }
        for (Integer i : temp) {
            res.append(i).append(" ");
            s1.push(i);
        }

        return res.toString();
    }
}