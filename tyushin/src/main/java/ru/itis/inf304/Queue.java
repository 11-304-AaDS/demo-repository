package ru.itis.inf304;

public interface Queue<T> {

    T peek();

    void push(T value);

    T pop();

    boolean isEmpty();

}
