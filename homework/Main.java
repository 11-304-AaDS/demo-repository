package homework;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(5);
        // test 1
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println();
        queue.push(4);
        queue.push(5);
        System.out.println(Arrays.toString(queue.getArray()));

        //test 2
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(Arrays.toString(queue.getArray()));

        System.out.println(queue.peek());
        queue.pop();
        System.out.println(Arrays.toString(queue.getArray()));
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(Arrays.toString(queue.getArray()));
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(Arrays.toString(queue.getArray()));
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(Arrays.toString(queue.getArray()));
        System.out.println();
//        System.out.println(queue.peek());
//
//
//        System.out.println(queue.getSize());
//        System.out.println(queue.peek());
        queue.push(-1);
        System.out.println(Arrays.toString(queue.getArray()));
        queue.push(-2);
        System.out.println(Arrays.toString(queue.getArray()));
        queue.push(-3);
        System.out.println(Arrays.toString(queue.getArray()));
        queue.push(-4);
        System.out.println(Arrays.toString(queue.getArray()));
        queue.push(-5);
        System.out.println(Arrays.toString(queue.getArray()));
        System.out.println(queue.pop());
        queue.push(-6);
        System.out.println(Arrays.toString(queue.getArray()));

    }
}
// свой класс Queue через массив (записываем в начало)
// push / pop / peek/ isEmpty
// top = (top + 1) % n
// Main  - начальные данные + все методы используются

