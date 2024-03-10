package ru.itis.AaDS.queue;

public interface Queue<T> {

    T peek();

    void push(T value);

    T pop();

    boolean isEmpty();

}
