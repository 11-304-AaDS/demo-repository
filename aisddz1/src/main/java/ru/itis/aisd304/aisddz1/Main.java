package ru.itis.aisd304.aisddz1;

public class Main {
    public static void main(String[] args) throws FullQueueException, EmptyQueueException {
        Queue<Integer> queue = new Queue<>(7);

        //Test Queue
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        System.out.println(queue.toString());
        queue.print();

        System.out.println();
        System.out.println();

        System.out.println("Pop: " + queue.pop());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Empty?: " + queue.isEmpty());
        System.out.println(queue.toString());
        queue.print();

        System.out.println();
        System.out.println();

        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue.toString());
        queue.print();

        System.out.println();
        System.out.println();

        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue.toString());
        queue.print();

        System.out.println();
        System.out.println();

        queue.push(8);
        queue.push(9);
        queue.push(10);
        queue.push(11);
        System.out.println(queue.toString());
        queue.print();
        //элемент 7 будет top и уйдёт с pop,
        //поскольку он пришёл раньше 8,9,10,11,
        //соответственно он первым и уйдёт с pop

        System.out.println();
        System.out.println();

        System.out.println("Pop: " + queue.pop());
        System.out.println("Pop: " + queue.pop());
        System.out.println(queue.toString());
        queue.print();





        //Test IsEmpty
        //System.out.println("Empty?: " + queue.isEmpty());


        //Test FullQueueException
        /*queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);*/

        //Test EmptyQueueException
        // System.out.println(queue.pop());
    }
}