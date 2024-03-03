package Queue_1;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>(5);
        System.out.println("<------push(1, 2, 3, 4, 5)------>");
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue);
        System.out.println("<------pop()------>");
        queue.pop();
        System.out.println(queue);
        System.out.println("<------pop()------>");
        queue.pop();
        System.out.println(queue);
        System.out.println("<------pop()------>");
        queue.pop();
        System.out.println(queue);
        System.out.println("<------pop()------>");
        queue.pop();
        System.out.println(queue);
        System.out.println("<------push(1)------>");
        queue.push(1);
        System.out.println(queue);
        System.out.println("<------peek()------>");
        System.out.println(queue.peek());
        System.out.println("<------pop()------>");
        queue.pop();
        System.out.println(queue);
        System.out.println("<------pop()------>");
        queue.pop();
        System.out.println(queue);
        System.out.println("<------isEmpty()------>");
        System.out.println(queue.isEmpty());
    }
}
