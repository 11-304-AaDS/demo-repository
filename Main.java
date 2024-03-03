package Practic3HW;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
        System.out.println(queue.isEmpty());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        queue.output();
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        queue.output();
    }
}
