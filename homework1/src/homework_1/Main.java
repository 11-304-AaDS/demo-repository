package homework_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue queue = new Queue();

        System.out.println("Pushing 5 elements, initial capacity = 5");
        Thread.sleep(1000,0);
        queue.push(1);
        System.out.println(queue.toString());
        Thread.sleep(1000,0);
        queue.push(2);
        System.out.println(queue.toString());
        Thread.sleep(1000,0);
        queue.push(3);
        System.out.println(queue.toString());
        Thread.sleep(1000,0);
        queue.push(4);
        System.out.println(queue.toString());
        Thread.sleep(1000,0);
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

        System.out.println("Pushing element to start, then last index isn't null");
        Thread.sleep(1500,0);
        queue.push(10);
        System.out.println(queue.toString());
        Thread.sleep(1500,0);

        System.out.println("Pushing element, then capacity and size are both");
        Thread.sleep(1500,0);
        queue.push(100);
        System.out.println(queue.toString());

    }
}
