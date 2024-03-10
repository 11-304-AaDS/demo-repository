package homework2;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new Queue();
        System.out.println("Pushing 5 elements:");
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        System.out.println(queue.toString());
        Thread.sleep(1000,0);

        System.out.println("Pop result: " + queue.pop());
        Thread.sleep(1000,0);
        System.out.println(queue.toString());
        Thread.sleep(1000,0);

        System.out.println("Peek result: " + queue.peek());
        Thread.sleep(1000,0);
        System.out.println(queue.toString());
        Thread.sleep(1500,0);

        System.out.println("isEmpty result: " + queue.isEmpty());
        Thread.sleep(1500,0);

    }
}
