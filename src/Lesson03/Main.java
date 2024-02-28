package Lesson03;

public class Main {
    public static void main(String args[]) throws Exception {
        Queue queue = new Queue(5);

        //очередь полностью заполняется
        queue.push(10);
        queue.push(11);
        queue.push(12);
        queue.push(13);
        queue.push(14);

        //удаляет первое значение (10)
        queue.pop();

        //добавляет 15 в конец очереди
        queue.push(15);

        //для наглядности, что началом очереди стало 11, выводит, что следующим удалится оно
        System.out.println("Следующим будет удалено значение: " + queue.peek());

        //удаляет еще четыре элемента (осталось только 15)
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        //демонстрирует, что следующим будет удалено 15
        System.out.println("Следующим будет удалено значение: " + queue.peek());
        queue.pop();

        for (int i = 0; i < 5; i++) {
            int i1 = queue.array[i];
            System.out.println(i1);
        }
    }
}
