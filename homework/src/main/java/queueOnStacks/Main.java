package queueOnStacks;

public class Main {
    public static void main(String[] args) {
        QueueOnStacks myQueue = new QueueOnStacks();
        myQueue.push(1); // очередь: [1]
        myQueue.push(2); // очередь: [1, 2] (начало очереди — самый левый элемент)
        myQueue.peek(); // вернёт 1
        myQueue.pop(); // вернёт 1, очередь: [2]
        System.out.println(myQueue.empty());// вернёт false
    }
}
