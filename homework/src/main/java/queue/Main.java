package queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue<Integer>(5);
        System.out.println(queue.isEmpty());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.isEmpty());
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.push(124);
        queue.push(613);
        System.out.println(queue.peek());

    }
}
