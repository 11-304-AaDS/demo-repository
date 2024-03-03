package Queue_1;

public class Queue<T> {

    private final Object[] array;
    private int capacity;
    private int top = -1; // index
    private int end = -1; // index

    public Queue(int n) {
        array = new Object[n];
    }

    public void push(T value) { // Добавить в конец
        if (capacity >= array.length) throw new RuntimeException();

        if (top == -1) {
            array[0] = value;
            top = 0;
            end = 0;
        }
        else {
            end = (end + 1) % array.length;
            array[end] = value;
        }
        capacity++;
    }

    public T pop() { // Удалить первый элемент и вернуть
        if (isEmpty()) throw new RuntimeException();

        T value = (T) array[top];
        array[top] = null;
        capacity--;
        if (capacity == 0) {
            top = -1;
            end = -1;
            return value;
        }

        top = (top + 1) % array.length;
        return value;
    }

    public T peek() { // Вернуть первый элемент
        if (isEmpty()) throw new RuntimeException();
        return (T) array[top];
    }

    public boolean isEmpty() { // Пустой список или нет
        return capacity == 0;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (top == i && end == i) {
                string.append(array[i]).append(" <- top, end").append("\n");
            }
            else if (top == i) {
                string.append(array[i]).append(" <- top").append("\n");
            }
            else if (end == i) {
                string.append(array[i]).append(" <- end").append("\n");
            }
            else {
                string.append(array[i]).append("\n");
            }
        }
        return string.toString().strip();
    }
}

