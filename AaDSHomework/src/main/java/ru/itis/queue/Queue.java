package ru.itis.queue;

public class Queue<T> implements IQueue<T> {
    private int generalSize; // общая длина очереди
    private int currentSize; // текущее количество элементов в очереди
    private T[] queue; // массив элементов (ограниченная очередь)
    private int top; // номер первого элемента
    private int end; // номер последнего элемента

    public Queue(int generalSize) {
        if (generalSize == 0) try {
            throw new ArraySizeIsNullException();
        } catch (ArraySizeIsNullException e) {
            System.err.println("Длина массива не может быть нулевая");
            throw new RuntimeException();
        }
        this.generalSize = generalSize;
        queue = (T[]) new Object[generalSize];
        top = 0;
        end = 0;
    }

    @Override
    public void push(T e) {
        if (currentSize == generalSize) {
            System.out.println("Очередь переполнена");
            return;
        }

        if (currentSize != 0) end = (end + 1) % (generalSize);
        queue[end] = e;

        currentSize++;
    }

    @Override
    public T pop() {
        if (!isEmpty()) {
            System.out.println("Очередь пуста, удалять нечего");
            return null;
        }
        top = (currentSize != 1) ? (top + 1) % generalSize : top;
        currentSize--;
        if (currentSize == 0) return queue[top];
        return queue[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return currentSize != 0;
    }

    @Override
    public T peek() {
        return queue[top];
    }

    @Override
    public String toString() {
        StringBuilder array = new StringBuilder();
        for (int i = top; i <= end; i++) {
            array.append(queue[i] + " ");
        }
        return array.toString();
    }
}
