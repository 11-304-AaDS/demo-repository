package ru.itis.queuebystack;

public interface IQueue<T> {
    void push(T e);

    T pop();

    boolean isEmpty();

    T peek();
}
