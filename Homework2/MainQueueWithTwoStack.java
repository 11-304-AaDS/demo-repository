package Homework2;

import java.util.Arrays;

public class MainQueueWithTwoStack {
    public static void main(String[] args) {
        QueueWithTwoStack<Integer> a = new QueueWithTwoStack();
        a.push(5);
        a.push(4);
        a.push(3);
        System.out.println("Положим 3 элемента в очередь:");
        System.out.println(a);
        System.out.println("Удалим два элемента:");
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println("Посмотрим оставшийся:");
        System.out.println(a.peek());
        System.out.println("Положим еще 3 элемента в очередь:");
        a.push(2);
        a.push(1);
        a.push(0);
        System.out.println(a);
        System.out.println("Удалим все элементы:");
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a);
        System.out.println("Очередь пуста?");
        System.out.println(a.isEmpty());
    }
}
