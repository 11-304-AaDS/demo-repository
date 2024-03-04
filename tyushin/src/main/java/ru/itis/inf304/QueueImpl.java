package ru.itis.inf304;

import java.util.Arrays;

public class QueueImpl<T> implements Queue<T> {
    private int top;
    private int end;
    private T[] arr;
    private int size;
    private int capacity;

    public QueueImpl(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.top = 0;
        this.end = -1; //чтобы при добавление первого элемента не добавлялся на второе место
        this.arr = (T[]) new Object[capacity];
    }


    @Override
    public T peek() {
        return arr[top];
    }

    @Override
    public void push(T value) {
        if (size == capacity) {
            throw new IndexOutOfBoundsException();
        }
        if (end < capacity - 1) {  // -1 потому что массив от 0
            arr[end+1] = value;
            end++;
        } else {
            end = 0;
            arr[end] = value;
        }
        size++;


    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        T temp = arr[top];
        arr[top] = null;
        if (top < capacity - 1) {
            top++;
        } else {
            top = 0;
        }
        size--;

        return temp;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    public String toString() {
        return Arrays.toString(arr);
    }
}
