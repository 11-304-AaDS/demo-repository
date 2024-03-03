package homework1;

public class Main {
    public static void main(String[] args) {
        Queue s = new Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        System.out.println("Заполнили массив значениями");
        System.out.println(s.toString());

        System.out.println("Удаляем элемент из начала очереди");
        System.out.println(s.pop());
        System.out.println(s.toString());

        System.out.println("Удаляем элемент из начала очереди");
        System.out.println(s.pop());
        System.out.println(s.toString());
        
        System.out.println("Добавляем новый элемент");
        s.push(2);
        System.out.println(s.toString());

        System.out.println("Добавляем новый элемент");
        s.push(1);
        System.out.println(s.toString());

        System.out.println("Добавляем новый элемент");
        s.push(15);
        System.out.println(s.toString());

    }
}
