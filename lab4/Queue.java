package ru.itis.inf304.lab4;

import java.util.Arrays;

public class Queue<T> implements Iqueue<T>{
    private int size;
    private int countpop;
    private int indextop;
    private int indexend;
    private final int capacity;
    private Object[] array;
    public Queue(int capacity){
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    @Override
    public void push(T e) {
        if (isEmpty()){
            array[indextop] = e;
            indextop = indexend;
            size++;
        } else if (array[capacity-1] != null) {
            int i = 0;
            while (array[i] != null){
                i++;
            }
            indexend = i;
            array[i] = e;
            size++;
        } else {
            int i = size;
            while (array[i] != null){
                i++;
            }
            indexend = i;
            array[i] = e;
            size++;
        }
    }

    @Override
    public T peek() {
        return (T) array[indextop];
    }

    @Override
    public T pop() {
        int temp = indextop;
        indextop = (indextop + 1) % capacity;
        size--;
        T t = (T) array[temp];
        array[temp] = null;
        countpop++;
        return t;
    }
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "size=" + size +
                ", indextop=" + indextop +
                ", indexend=" + indexend +
                ", array=" + Arrays.toString(array) +
                '}';
    }
    public int getSize() {
        return size;
    }
    public T gettop(){
        return (T) array[indextop];
    }
    public T getend(){
        return (T) array[indexend];
    }
}
