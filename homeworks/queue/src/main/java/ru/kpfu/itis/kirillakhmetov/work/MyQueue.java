package ru.kpfu.itis.kirillakhmetov.work;

@SuppressWarnings("unchecked")
public class MyQueue<T> {
    private final T[] queue;
    private final int size;
    private int capacity = 0;
    private int top = -1;
    private int end = -1;

    public MyQueue(int size) {
        this.size = size;
        queue = (T[]) new Object[size];
    }

    public void push(T element) {
        if (((end + 1) % size) == top) {
            System.out.println("Error: The queue is completely full");
        } else {
            if (top == -1) {
                top = 0;
            }
            end = (end + 1) % size;
            queue[end] = element;
            capacity++;
        }

    }
    public T pop() {
        if (!isEmpty()) {
            T element = queue[top];
            top = (top + 1) % size;
            capacity--;
            return element;
        }
        return null;
    }
    public boolean isEmpty() {
        return capacity == 0;
    }
    public T peek() {
        if (!isEmpty()) {
            return queue[top];
        }
        return null;
    }
}
