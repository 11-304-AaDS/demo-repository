package QueueWithStacks;

public class Main {
    public static void main(String[] args) {
        QueueWithStacks<Integer> queue = new QueueWithStacks<Integer>();
        queue.push(3);
        queue.push(45);
        queue.push(66);
        System.out.println(queue.isEmpty());
        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }
}
