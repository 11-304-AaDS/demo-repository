public class Queue {
    int[] arr;
    int size = 0;
    int top = 0;
    int end = 0;

    public Queue(int c) {
        this.arr = new int[c];
    }


    public void push(int elem) {
        if (arr.length == size) throw new ArrayIndexOutOfBoundsException();
        arr[end] = elem;
        size++;
        end = (size + top) % arr.length;
    }

    public void pop() {
        arr[top] = 0;
        top = (top + 1) % arr.length;
        size--;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    public int peek() {
        return arr[top];
    }

    public void output() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
