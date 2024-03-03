package lab01;

public class Main {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        if (queue.isEmpty()) System.out.println("Очередь пустая");
        else System.out.println("Очередь не пустая");
        queue.push("First");
        queue.push("Second");
        queue.push("Third");
        if (queue.isEmpty()) System.out.println("Очередь пустая");
        else System.out.println("Очередь не пустая");
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        System.out.println(queue.peek());

    }
}
