package homework1103DequeOnTwoStack;

// очередь через два стека
// pop push empty peek o(1) class
// deque

import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        QueueThroughTwoStacks<Integer> queueThroughTwoStacks = new QueueThroughTwoStacks<>();
        System.out.println(queueThroughTwoStacks);
        System.out.println(queueThroughTwoStacks.isEmpty());
        queueThroughTwoStacks.push(1);
        queueThroughTwoStacks.push(2);
        queueThroughTwoStacks.push(3);
        queueThroughTwoStacks.push(4);
        System.out.println(queueThroughTwoStacks);
        System.out.println(queueThroughTwoStacks.peek());
        System.out.println(queueThroughTwoStacks);
        System.out.println(queueThroughTwoStacks.pop());
        System.out.println(queueThroughTwoStacks);
        System.out.println(queueThroughTwoStacks.pop());
        System.out.println(queueThroughTwoStacks.pop());
        System.out.println(queueThroughTwoStacks.isEmpty());
        System.out.println(queueThroughTwoStacks.pop());
       // System.out.println(queueThroughTwoStacks.pop());
        System.out.println(queueThroughTwoStacks.isEmpty());

    }
}
