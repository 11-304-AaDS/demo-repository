package ru.itis.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue(5);
        queue.push(3);
        System.out.println(queue.toString());
        queue.push(5);
        System.out.println(queue.toString());
        queue.push(2);
        System.out.println(queue.toString());
        queue.push(7);
        System.out.println(queue.toString());
        queue.push(9);
        System.out.println(queue.toString());

        System.out.println("how peek works: queue.peek() = " + queue.peek());

        System.out.println("how pop works: queue.pop() = " + queue.pop());

        System.out.println("how queue looks after pop:" + queue.toString());

        queue.pop();
        System.out.println(queue.toString());
        queue.pop();
        System.out.println(queue.toString());
        queue.pop();
        System.out.println(queue.toString());
        queue.push(10);
        System.out.println(queue.toString());
        queue.push(32);

        System.out.println(queue.toString());
    }
}