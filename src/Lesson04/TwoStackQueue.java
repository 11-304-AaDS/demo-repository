package Lesson04;

import java.util.LinkedList;

public class TwoStackQueue<T> {
    /*
    очередь добавляется в первый стэк, затем переворачивается во второй
    уже оттуда используются методы pop и peek
    при добавлении новых элементов, очередь снова переходит из второго стэка в первый
    и там происходит добавление. после него стэк опять переворачивается во второй стэк
    (то есть очередь всегда хранится во втором стэке)
     */
    LinkedList<T> stack1 = new LinkedList<>();
    LinkedList<T> stack2 = new LinkedList<>();
    public T pop() {
        T deletedValue = stack2.peek();
        stack2.pop();
        return deletedValue;
    }
    public void push(T value) {
        if (!stack2.isEmpty()) {
            stack1 = flip(stack2);
        }
        stack1.push(value);
        stack2 = flip(stack1);
    }

    private LinkedList<T> flip(LinkedList<T> stack) {
        LinkedList<T> flippedStack = new LinkedList<>();
        for (int i = stack.size() - 1; i > -1; i--) {
            flippedStack.push(stack.get(i));
        }
        return flippedStack;
    }
    public boolean isEmpty() {
        return stack2.isEmpty();
    }
    public T peek() {
        return stack2.peek();
    }
}
