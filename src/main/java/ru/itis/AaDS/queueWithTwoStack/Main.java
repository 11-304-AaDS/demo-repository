package ru.itis.AaDS.queueWithTwoStack;

public class Main {
    public static void main(String[] args) {
        TwoStackQueue<Integer> q = new TwoStackQueue<>();

        for (int i = 1; i < 11; i++) {
            q.push(i);
        }
        System.out.println(q.toString());

        q.pop();
        System.out.println(q.toString());

        q.push(100);
        System.out.println(q.toString());

        for (int i = 0; i < 10; i++) {
            q.pop();
        }
        System.out.println(q.toString());
        System.out.println(q.isEmpty());

        q.push(1000);
        System.out.println(q.isEmpty());
        System.out.println(q.toString());
    }
}

