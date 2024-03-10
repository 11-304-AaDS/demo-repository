package ru.itis.inf304.lab6;

public interface DoubleStackImpl<T> {
    T peek();
    boolean isEmpty();
    T pop();
    void push(T e);
}
