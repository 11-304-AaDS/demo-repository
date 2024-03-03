package homework_1;

import java.util.Arrays;

public class Queue implements IQueue {
    public Object[] massiv;
    private int top;
    private int end;
    private int size;
    private int capacity;

    public Queue() {
        size = 0;
        massiv = new Object[5];
        capacity = 5;
    }

    @Override
    public void push(Object element) {
        if (size == 0) {
            top = 0;
            end = 0;
            massiv[0] = element;
            size++;
        } else if (capacity == size) {
            Object[] massiv_for_copy = new Object[size*2];
            System.arraycopy(massiv,0,massiv_for_copy,0,capacity);
            capacity = capacity * 2;
            massiv = massiv_for_copy;
            massiv[size] = element;
            end = size;
            size++;
        } else {
            size++;
            end = (end + 1) % capacity;
            massiv[end] = element;
        }
    }

    @Override
    public Object pop() throws NullPointerException {
        if (size == 0) {
            throw  new NullPointerException("21321");
        } else {
            Object res = massiv[top];
            massiv[top] = null;
            top++;
            size--;
            return res;
        }
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        else return false;
    }

    @Override
    public Object peek() throws NullPointerException {
        if (size == 0) {
            throw new NullPointerException();
        } else {
            return massiv[top];
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(massiv);
    }
}

