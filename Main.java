public class Main {
    public static void main(String[] args) {
        // задаем размер массива
        Queue q = new Queue(7);
        // ввод элементов очереди
        q.push(3);
        q.push(11);
        q.push(2);
        q.push(63);
        q.push(5);
        q.push(57);
        q.push(76);
        // вывод очереди
        System.out.println("вывод очереди : ");
        q.output();
        // удаление двух элементов
        q.pop();
        q.pop();
        // вывод очеред почле удаления двух элементов
        System.out.println("вывод очереди без двух элементов : ");
        q.output();
        // проверяет, пустая ли очередь
        System.out.println("пустая ли очередь?");
        System.out.println(q.isEmpty());
        // удаляет остальные элементы
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        // показывает, какой элемент будет удален следующим (последним)
        System.out.println("какой элемент будет удален следующим?");
        System.out.println(q.peek());
        q.pop();
        // проверяет, пустая ли очередь снова
        System.out.println("пустая ли очередь?");
        System.out.println(q.isEmpty());


    }

}
