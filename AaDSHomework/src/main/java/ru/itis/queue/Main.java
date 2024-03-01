package ru.itis.queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> array = new Queue<>(0);
        array.push(9);
        array.push(13);
        array.push(5);
        array.push(7);
        array.push(10);
        System.out.println(array);
        array.pop();
        array.pop();
        System.out.println(array.peek());
        System.out.println(array);
    }
}
