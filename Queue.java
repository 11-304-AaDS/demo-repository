package ru.itis.queue;

import java.util.Arrays;

public class Queue<T> implements IQueue<T>{

    private T[] mass;

    private int size;

    private int top;

    private int end;

    public Queue(int length) {
        mass = (T[]) new Object[length];
        size = 0;
    }

    @Override
    public void push(T e) throws ArrayIndexOutOfBoundsException{

        if (size == mass.length) throw new ArrayIndexOutOfBoundsException();

        if (size == 0){
            mass[size] = e;
            top = 0;
            end = 0;
        } else {
            end = (end + 1) % mass.length;
            mass[end] = e;
        }
        size++;
    }



    @Override
    public T pop(){
        if (isEmpty()) return null;
        T e = mass[top];
        mass[top] = null;
        size--;
        if (top <= mass.length) {
            top++;
        } else {
            top = (top + 1) % mass.length ;
        }
        if (size == 0) {
            top = -1;
            end = -1;
        }
        return e;
    }

    @Override
    public boolean isEmpty() {
        if (size != 0) return false;
        return true; //true - empty, false - not empty
    }

    @Override
    public T peek() {
        return mass[top];
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + Arrays.toString(mass) +
                ", size=" + size +
                ", top=" + (top + 1) +
                ", end=" + (end + 1) +
                '}';
    }
}
