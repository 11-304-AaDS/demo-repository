package queue;

public class Queue <T> implements QueueInterface <T>{

    private int size;
    private int counter = 0;
    private Object[] array;
    public Queue(int size){
        this.size = size;
        this.array = new Object[size];
    }

    private T top;
    private T end;


    @Override
    public void push(T element) throws IndexOutOfBoundsException {
        if (counter == array.length) throw new IndexOutOfBoundsException();
        if (array[counter] != null) throw new IndexOutOfBoundsException();
        if (end == null){
            top = element;
        }
        array[counter++] = element;
        end = element;
    }

    @Override
    public T peek() {
        return top;
    }

    @Override
    public T pop() {
        T oldTop = top;
        for (int i = 0; i < array.length; i++){
            if (array[i] == top){
                top = (T) array[i+1];
                array[i] = null;
                break;
            }
        }
        if (array.length==counter ){
            counter = 0;
        }
        if (counter != 0){
            counter--;
        }
        return oldTop;
    }

    @Override
    public boolean isEmpty() {
        if (end != null){
            return false;
        }
        return true;
    }
}
