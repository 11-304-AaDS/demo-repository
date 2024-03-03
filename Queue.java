package homework1;

import java.util.Arrays;

public class Queue implements IQueue{
    private Object[] mass;
    private int top; //xранит индекс головы
    private int end; //хранит индекс конца
    private int size; //кодичество заполненных ячеек
    private int capacity; //максимальное количество элементов, которое можно сохранить в массиве, capacity == mass.lenght()

    public Queue() {
        size = 0;
        mass = new Object[10];
        capacity = 10;
    }

    @Override
    public void push(Object e) {
        if (size == 0) {
            top = 0;
            end = 0;
            mass[size] = e;
            size++;
        }
        else {
            if (capacity == size) {
                Object[] mass2 = new Object[capacity * 2];
                System.arraycopy(mass, 0, mass2, 0, capacity);
                capacity *= 2;
                mass = mass2;
                mass[size] = e;
                end = size;
                size++;
            } else {
                size++;
                end = (end + 1) % capacity;
                mass[end] = e;
            }
        }
    }


    //возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
    @Override
    public Object pop() {
        if (size != 0) {
            Object o = mass[top];
            mass[top] = null;
            top++;
            size--;
            return o;
        }
        return null;
    }

    @Override
    public boolean isEmpty(){
        return size == 0;
    }


    //возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
    @Override
    public Object peek() {
        if(size == 0) return null;
        else return mass[top];
    }


    public String toString() {
        return Arrays.toString(mass) + ";   Индекс первого в очереди = " + top + ";   Индекс последнего в очереди = " + end;
    }
}
