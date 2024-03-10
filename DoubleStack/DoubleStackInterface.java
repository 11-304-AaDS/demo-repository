package DoubleStack;

public interface DoubleStackInterface<T> {
    T peek();
    boolean isEmpty();
    T pop();
    void push(T e);
}