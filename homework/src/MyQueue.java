public class MyQueue<T> {
    private int size;
    private int last = -1;
    private int copasity = 3;
    Object[] list = new Object[copasity];

    public void push(int e) {
        if (size == (copasity - 1)) {
            copasity *= 2;
            Object[] newList = new Object[copasity * 2];
            for (int i = 0; i < size; ++i) {
                newList[i] = list[i];
            }
            list = newList;
            list[++last] = e;
        } else {
            list[++last] = e;
        }
        size++;
    }

    public T peek() {
        return (T) list[0];
    }

    public T pop() {
        if (!isEmpty()) {
            T res = (T) list[0];
            for (int i = 0; i <= last; ++i) {
                list[i] = list[i + 1];
            }
            last--;
            size--;
            return res;
        }
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void output() {
        for (int i = 0; i < size; ++i) {
            System.out.print(list[i]);
        }
        System.out.println();
    }
}
