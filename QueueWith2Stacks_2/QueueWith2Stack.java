import java.util.*;

public class QueueWith2Stack<T> {
    private final Deque<T> stackFirst = new LinkedList<>();
    private final Deque<T> stackSecond = new LinkedList<>();

    public void push(T value) {
        stackFirst.push(value);
    }

    public T pop() {
        if (stackSecond.isEmpty()) pourOver();
        return stackSecond.pop();
    }

    public boolean isEmpty() {
        return stackFirst.isEmpty() && stackSecond.isEmpty();
    }

    public T peek() {
        if (stackSecond.isEmpty()) pourOver();
        return stackSecond.peek();
    }

    private void pourOver() { // from first into second
        while (!stackFirst.isEmpty()) {
            stackSecond.push(stackFirst.pop());
        }
    }

    @Override
    public String toString() {
        List<T> list = new ArrayList<>();
        while (!stackSecond.isEmpty()) {
            while (!stackSecond.isEmpty()) {
                T value = stackSecond.pop();
                list.add(value);
            }
            pourOver();
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            stackSecond.push(list.get(i));
        }
        return list.toString();
    }
}
