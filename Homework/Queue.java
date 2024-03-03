package Homework;

import java.util.Arrays;

public class Queue<T>{
    private final int cap;
    private int len;
    T [] array;
    private int top;
    private int end;


    public Queue(int cap) {
        this.cap = cap;
        array = (T[]) new Object[cap];
    }


    public void push(T a) {
        if(len == 0){
            array[0] = a;
        }else {
            if(end+1 == cap){
                end = -1;
            }
            if(end+1 != top){
                array[++end] = a;
            }else throw new RuntimeException("Массив полностью заполнен. Надо удалить хоть какой-то элемент");
        }
        len++;
    }

    public T pop() {
        if(isEmpty()){
            throw new RuntimeException("Массив пустой");
        }
        T res = array[top];
        array[top]=null;
        len--;

        if(len==0){
//            System.out.println("Это будет последний удаленный из очереди элемент");
            end=top=len=0;
            return res;
        }
        if(top == cap-1){
            top = 0;
            return res;
        }

        top++;
        return res;
    }

    public T peek() {
        return array[top];
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public int getCap() {
        return cap;
    }
    public int getTop() {
        return top;
    }

    public int getEnd() {
        return end;
    }
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}