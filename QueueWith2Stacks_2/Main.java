public class Main{
    public static void main(String[] args) {
        QueueWith2Stack<Integer> queue = new QueueWith2Stack<>();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        queue.pop();
        queue.push(4);
        queue.push(5);
        queue.push(6);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}