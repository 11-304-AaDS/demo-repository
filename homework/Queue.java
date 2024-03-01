package homework;

public class Queue<T> {
    private  T[] array;
    private  int top;
    private  int size;
    private  int end;

    public Queue(int capacity) {
        array = (T[]) new Object[capacity];


    }
    public int getSize(){
        return size;
    }
    public T[] getArray() {
        return array;
    }

    public  void push(T elem){
        if (size == array.length){
            throw  new RuntimeException();
        }
        array[end++ % array.length] = elem;
        size++;
    }
    public T peek(){

        if (isEmpty()){
            throw new RuntimeException();
        }
        return array[top];
    }
    public  T pop(){
        if(isEmpty()){
            throw  new RuntimeException();
        }
        T elem = array[top];
        //  array[top] = -111111111;
        top =  (top + 1) % array.length;
        size--;
        return elem;
    }
    public boolean isEmpty(){
        return  size == 0;


    }
}
