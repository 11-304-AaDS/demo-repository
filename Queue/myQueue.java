package Queue;

import java.util.NoSuchElementException;

public class myQueue<T> {
    private int top = -1;
    private int end = -1;
    private int capacity;
    private Object[] array;

    public myQueue(int n) {
        array = new Object[n];
    }

    public void push(T e) {
        if (top == -1) {
            array[0] = e;
            top++;
            end++;
        } else {
            end = (end + 1) % array.length;
            array[end] = e;
        }
        capacity++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            T temp = (T) array[top];
            array[top] = null;
            capacity--;
            if (capacity == 0) {
                top = -1;
                end = -1;
                return temp;
            }
            top = (top + 1) % array.length;
            return temp;
        }
    }

    public boolean isEmpty() {
        return capacity == 0;
    }
    public T peek(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else{
            return (T) array[top];
        }
    }
    public String toString(){
        String temp = "";
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
            temp += " ";
        }
        return temp;
    }
}
