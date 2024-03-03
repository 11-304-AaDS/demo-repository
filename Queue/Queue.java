package Queue;


import java.util.Arrays;

public class Queue<T> {
    private T[] array;
    private int size;
    private int top;
    private int end;

    public Queue(int capacity) {
        array = (T[]) new Object[capacity];
    }
    public void push(T element) {
        if (size == array.length) {
            System.out.println("Очередь переполнена");
            return;
        }
        array[end++ % array.length] = element;
        size++;

    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            throw new RuntimeException();
        }
        return array[top];
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            throw new RuntimeException();
        }
        T element = array[top];
        array[top] = null;
        top = (top + 1) % array.length;
        size--;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}

