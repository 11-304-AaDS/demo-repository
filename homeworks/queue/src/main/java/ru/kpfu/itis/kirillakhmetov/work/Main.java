package ru.kpfu.itis.kirillakhmetov.work;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>(5);
        queue.push(1);
        queue.push(17);
        queue.push(5);
        queue.push(4);
        queue.push(9);
        System.out.println("Empty?: " + queue.isEmpty());
        System.out.println("First in queue: " + queue.peek());
        System.out.println("Pop: " + queue.pop());
        queue.push(13);
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println("-----");
        queue.push(4);
        queue.push(15);
        System.out.println("Peek: " + queue.peek());
    }
}