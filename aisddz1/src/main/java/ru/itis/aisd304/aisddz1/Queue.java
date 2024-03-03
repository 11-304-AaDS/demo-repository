package ru.itis.aisd304.aisddz1;

public class Queue<T> {
    private Object[] array;
    private int size = 0;
    private int capacity;
    private int top = -1;
    private int end = -1;
    public Queue(int capacity){
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public void push(T value) throws FullQueueException{
        if (size == capacity) throw new FullQueueException();
        if (top == -1 ) {
            top++;
        }
        end = (++end) % capacity;
        array[end] = value;
        size++;

    }
    public T pop() throws EmptyQueueException{
        if (size == 0) throw new EmptyQueueException();
        T elem = (T) array[top];
        array[top] = null;
        top = (++top)%capacity;
        size--;
        return elem;
    }


    public boolean isEmpty(){
        if (size == 0 ) return true;
        else return false;
    }

    public T peek() {
        return (T) array[top];
    }

    @Override
    public String toString(){
        return "Queue(" + "size = " + size +
                ", top = " + top + ", end = " + end + ")";

    }
    public void print() {
        for (Object object : array) {
            System.out.print(object + " ");
        }
    }
}