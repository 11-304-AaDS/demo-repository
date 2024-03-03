package les3.QueueDz;

import java.util.Arrays;

public class Queue<T> {
    private Object[] mas;
    private int size;
    private int capacity;
    private int top;
    private int end;

    public Queue(){
        mas = new Object[4];
        size = mas.length;
        capacity = 0;
        top = 0;
        end = 0;
    }

    @Override
    public String toString() {
        return  Arrays.toString(mas) +
                ", capacity=" + capacity +
                ", top=" + top +
                ", end=" + end;
    }

    //5 null 6 21 23 64
    public void push(T element) throws FullException {
        if (isEmty()){
            mas[0] = element;
            capacity++;
        }
        else {
            if (!isFull()){
                int a = (end + 1) % size;
                mas[a] = element;
                end = a;
                capacity++;
            } else throw new FullException();
        }
    }


    // 32 0 0 0 0 75
    public void pop() throws EmtyException{
        if (isEmty()) throw new EmtyException();
        else {
            mas[top] = null;
            top = (top + 1) % size;
            capacity--;
        }
    }

    public T peek(){
        return (T) mas[top];
    }

    private boolean isEmty(){
        if (capacity == 0) return true;
        return false;
    }

    private boolean isFull(){
        if (capacity == size) return true;
        return false;
    }
}
