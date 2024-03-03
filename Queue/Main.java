package Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>(5);
        queue.push(2);
        queue.push(4);
        queue.push(7);
        queue.push(6);
        queue.push(8);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println(queue.isEmpty());
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);

    }
}
