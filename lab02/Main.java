package lab02;

public class Main {
    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        System.out.println(queue.empty());

        queue.push(1);
        queue.push(5);
        queue.push(17);
        queue.push(9);
        queue.push(12);
        queue.push(6);

        System.out.println(queue.peek()); //верхний элемент очереди
        System.out.println(queue.pop()); //удаление верхнего элемента
        System.out.println(queue.peek());
        System.out.println(queue.empty()); //пуста ли очередь
    }
}

