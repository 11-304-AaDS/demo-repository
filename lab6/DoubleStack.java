package ru.itis.inf304.lab6;


import java.util.Stack;

public class DoubleStack<T> implements DoubleStackImpl<T> {

    Stack<T> stackFirst = new Stack<>();
    Stack<T> stackSecond = new Stack<>();
    @Override
    public void push(T e) {
        stackFirst.push(e);
    }
    @Override
    public T peek() {
        if (stackSecond.isEmpty()) {
            while (!stackFirst.isEmpty()) {
                stackSecond.push(stackFirst.pop());
            }
        }
        return stackSecond.peek();
    }

    @Override
    public boolean isEmpty() {
        return stackFirst.isEmpty() && stackSecond.isEmpty();
    }

    @Override
    public T pop() {
        if (stackSecond.isEmpty()){
            while (!stackFirst.isEmpty()){
                stackSecond.push(stackFirst.pop());
            }
        }
        return stackSecond.pop();
    }
    @Override
    public String toString() {
        return "DoubleStack{" +
                "stackFirst=" + stackFirst +
                ", stackSecond=" + stackSecond + '}';
    }
}
