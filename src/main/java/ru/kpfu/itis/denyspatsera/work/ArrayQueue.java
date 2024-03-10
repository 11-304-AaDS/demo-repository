package ru.kpfu.itis.denyspatsera.work;

import java.util.Arrays;
import java.util.NoSuchElementException;

@SuppressWarnings("unused")
public class ArrayQueue<T> {

    private final Object[] array;
    private final int capacity;
    private int size = 0;
    private int top = 0;
    private int end = 0;

    public ArrayQueue() {
        this(4);
    }

    public ArrayQueue(int capacity) {
        array = new Object[capacity];
        this.capacity = capacity;
    }

    public void push(T value) {
        if (size == capacity) throw new StackOverflowError();
        array[end % capacity] = value;
        size++;
        end++;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (size == 0) throw new NoSuchElementException();
        T res = (T) array[top];
        array[top] = null;
        top = ++top % capacity;
        size--;
        return res;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) array[top];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
