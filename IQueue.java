package ru.itis.queue;

public interface IQueue<T>{

    void push(T e) throws  ArrayIndexOutOfBoundsException;

    T pop();

    boolean isEmpty();

    T peek();
}
