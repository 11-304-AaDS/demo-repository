package ru.kpfu.itis.kirillakhmetov.work;

public class MyQueue<T> {
    private final T[] queue;
    private final int capacity;
    private int size = 0;
    private int top = -1;
    private int end = -1;
    
    public MyQueue(int capacity) {
        this.capacity = capacity;
        //noinspection unchecked
        queue = (T[]) new Object[capacity];
    }

    public void push(T element) {
        if (size == capacity) {
            System.out.println("Error: The queue is completely full");
        } else {
            if (top == -1) {
                top++;
            }
            end = (++end) % capacity;
            queue[end] = element;
            size++;
        }

    }
    public T pop() {
        if (!isEmpty()) {
            T element = queue[top];
            top = (++top) % capacity;
            size--;
            return element;
        }
        return null;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public T peek() {
        if (!isEmpty()) {
            return queue[top];
        }
        return null;
    }
}
