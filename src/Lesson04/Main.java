package Lesson04;

public class Main {
    public static void main(String args[]) {
        TwoStackQueue<Integer> queue = new TwoStackQueue<>();
        queue.push(10);
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.push(14);
        System.out.println(queue.pop());
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.isEmpty());
        queue.push(15);
        System.out.println(queue.pop());
    }
}
