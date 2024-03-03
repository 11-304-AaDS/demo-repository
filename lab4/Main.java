package ru.itis.inf304.lab4;

public class Main {
    // peek - посмотреть first
    // main проверить методы, top = (top+1) % N

    public static void main(String[] args) {
        Iqueue<Integer> queue = new Queue<>(4);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue);
        queue.pop();
        System.out.println(queue);
        System.out.println(queue.getSize());
        queue.push(4);
        System.out.println(queue);
        queue.pop();

        System.out.println(queue);

        queue.push(5);

        System.out.println(queue);
        queue.pop();

        System.out.println(queue);

        System.out.println(queue.gettop());
        System.out.println(queue.getend());
        queue.push(6);

        System.out.println(queue);

        System.out.println(queue.gettop());
        System.out.println(queue.getend());
        System.out.println(queue.peek());

        queue.pop();
        System.out.println(queue);
        System.out.println(queue.gettop());
        System.out.println(queue.getend());

        System.out.println(queue.isEmpty());
        queue.pop();
        queue.pop();
        System.out.println(queue.isEmpty());

    }
}
