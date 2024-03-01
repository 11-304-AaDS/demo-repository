package src.main.java.ru.kpfu.itis.denyspatsera.work;

public class Main {

    public static void main(String[] args) {
        ArrayQueue<String> stringArrayQueue = new ArrayQueue<>();
        System.out.println(stringArrayQueue);
        stringArrayQueue.push("Hello1");
        stringArrayQueue.push("Hello2");
        stringArrayQueue.push("Hello3");
        stringArrayQueue.push("Hello4");
        System.out.println(stringArrayQueue);
        String pop = stringArrayQueue.pop();
        System.out.print(pop + " ");
        System.out.println(stringArrayQueue);
        String peek = stringArrayQueue.peek();
        System.out.print(peek + " ");
        System.out.println(stringArrayQueue);
    }
}
