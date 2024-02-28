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
        System.out.println("Вывод исходной очереди");
        output(queue);

        //удаляет первое значение (10)
        queue.pop();

        //добавляет 15 в конец очереди
        queue.push(15);

        System.out.println("Вывод очереди, где удалили 10 и добавили 15");
        output(queue);
        //для наглядности, что началом очереди стало 11, выводит, что следующим удалится оно
        System.out.println("Следующим будет удалено значение: " + queue.peek());

        //удаляет еще четыре элемента (осталось только 15)
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
        System.out.println("Вывод очереди, где удалены первые 5 элементов");
        output(queue);

        //демонстрирует, что следующим будет удалено 15
        System.out.println("Следующим будет удалено значение: " + queue.peek());
        queue.pop();

        output(queue);
    }

    public static void output(Queue queue){
        for (int i = 0; i < 5; i++) {
            int i1 = queue.array[i];
            System.out.println(i1);
        }
    }
}
