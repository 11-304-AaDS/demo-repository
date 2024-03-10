package ru.itis.aisd304.aisddz2;

public class Main {
    public static void main(String[] args) {
        QueueByTwoStacks<Integer> queue = new QueueByTwoStacks<>();

        queue.push(7);
        queue.push(5);
        queue.push(1);
        queue.push(2);

        System.out.println(queue);

        System.out.println(queue.empty());

        System.out.println(queue.peek());

        System.out.println(queue.pop());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        System.out.println(queue.pop());

        System.out.println(queue.empty());
        System.out.println(queue);

        queue.push(8);
        System.out.println(queue);
        queue.push(9);
        System.out.println(queue);
        queue.push(10);

        System.out.println(queue);
        System.out.println(queue.empty());

    }
}