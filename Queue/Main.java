package Queue;

public class Main {
    public static void main(String[] args) {
        myQueue<Integer> queue = new myQueue<>(5);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        queue.push(1);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.pop();
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
    }
}
