package ru.kpfu.itis.kirillakhmetov.work;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        queue.push(5);
        queue.push(17);
        queue.push(9);
        queue.push(0);
        System.out.println(queue.pop());
        queue.push(13);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
    }
}