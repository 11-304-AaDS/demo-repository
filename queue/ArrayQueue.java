package queue;

public class ArrayQueue <T>{
    private int capacity;
    private int size;
    private int top;
    private int end;
    private Object[] array;


    public ArrayQueue(int capacity){
        this.capacity = capacity;
        array = new Object[capacity];
    }
    public void push(T argument){
        if (size == capacity){
            System.out.println("Ошибка");
        }
        array[end % capacity] = argument;
        size++;
        end++;
    }
    public T pop() {
        if (size == 0){
            return null;
        }
        T res = (T) array[top];
        array[top] = null;
        top = (++top) % capacity ;
        size--;
        return res;
    }
    public void peek(){
        System.out.println(array[top%capacity]);
        System.out.println(array[end % capacity]);
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public void toStrinf(){
        if (isEmpty()){
            System.out.println("Пустота");
        }else{
            for (int i = 0;i < size;i ++){
                System.out.print(array[i].toString() + " ");
            }
            System.out.println();
        }
    }
}

