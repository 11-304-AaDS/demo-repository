package DoubleStack;

public class Main {
    public static void main(String[] args) {
        DoubleStack<Integer> queue = new DoubleStack<Integer>();
        queue.push(0);
        queue.push(1);
        queue.push(2);
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        queue.push(3);
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}