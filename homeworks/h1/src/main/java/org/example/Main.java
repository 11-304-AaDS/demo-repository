package org.example;

public class Main {
    public static void main(String[] args) throws QueueOverflowException, EmptyQueueException {
        MyQueue<Integer> queue = new MyQueue<>();

      //Test 1 push()
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.print();

/*
        //Test 2 pop()
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.print();
*/

/*
        //Test 3 pop() + push()
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.push(6);
        queue.print();
*/

/*
        //Test 4 over flow queue
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.print();
*/

/*
        //Test 5 empty queue
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.print();
*/

    }
}