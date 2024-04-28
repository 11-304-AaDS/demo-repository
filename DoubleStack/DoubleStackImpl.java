package DoubleStack;

public interface DoubleStackImpl<T> {
    T peek();
    boolean isEmpty();
    T pop();
    void push(T e);
}