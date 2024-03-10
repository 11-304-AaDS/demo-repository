package ru.itis.inf304.lab6;
public class Main {
    // очередь через два стека
    // свой класс, методы peek/isEmpty/pop/push
    // peеk у второго
    // идея перевернуть
    // pop только у второго
    // push у первого
    public static void main(String[] args) {
        DoubleStackImpl<Integer> queue = new DoubleStack<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);
        queue.push(4);
        System.out.println(queue);
        System.out.println(queue.peek());
    }
}
