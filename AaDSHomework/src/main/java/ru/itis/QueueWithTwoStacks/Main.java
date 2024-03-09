package ru.itis.QueueWithTwoStacks;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.push(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.peek());
        q.push(10);
        q.push(50);
        System.out.println(q);
    }
}
