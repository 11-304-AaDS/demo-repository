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
        System.out.println("Peek:" + queue.peek());
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue);
        queue.push(7);
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue);
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue);
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue);
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue);
        System.out.println("......");
        queue.push(10);
        queue.push(23);
        System.out.println(queue);
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue);
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue);
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue);
        System.out.println("Empty: " + queue.isEmpty());
    }
}
