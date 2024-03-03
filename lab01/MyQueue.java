package lab01;

public class MyQueue<T> {
    private Node<T> first;
    private Node<T> last;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public T pop() {
        if (isEmpty()) return null;
        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }
}
