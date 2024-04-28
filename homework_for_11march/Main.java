package ru.itis.queuebystack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<> ();
        queue.push(4);
        queue.push(5);
        System.out.println(queue.toString());
        System.out.println(queue.pop());
        System.out.println(queue.toString());
        queue.push(7);
        queue.push(9);
        System.out.println(queue.toString());
        System.out.println(queue.peek());
    }
}
