package org.example;

public class MyQueue<T> {

    private Object[] array;
    private int size = 0;
    private int capacity = 5;
    private int top = 0;
    private int end = 0;

    public MyQueue() {
        array = new Object[capacity];
    }

    public void push(T value) throws QueueOverflowException {
        if (size == capacity) throw new QueueOverflowException();
        array[end % capacity] = value;
        size++;
        end++;
    }

    public T pop() throws EmptyQueueException {
        if (size == 0) throw new EmptyQueueException();
        T res = (T) array[top];
        array[top] = null;
        top = (top + 1) % capacity;
        size--;
        return res;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T peek() {
        return (T) array[top];
    }

    public void print() {
        for (Object object : array) {
            System.out.print(object + " ");
        }
    }

    public int getSize() {
        return size;
    }

}
