package org.example;

public class Main {
    public static void main(String[] args) {

        DequeOnTwoStack deque = new DequeOnTwoStack();

        deque.push(1);
        deque.push(2);
        deque.push(3);
        deque.push(4);

        System.out.println(deque.peek());

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());

        deque.push(5);
        deque.push(6);
        deque.push(7);

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque.isEmpty());

    }
}