package hw_queue;

public class Main {
    public static void main(String[] args) throws Exception {
        Queue<Integer> a = new Queue<>(5);

        a.push(1);
        a.push(14);
        a.push(40);
        a.push(11);
        System.out.println("pop : " + a.pop());
        a.push(52);
        System.out.println();

        System.out.println("peek : " + a.pop());
        System.out.println("pop after peek : " + a.pop());
        System.out.println();

        System.out.println("isEmpty : " + a.isEmpty());
        a.pop();
        a.pop();
        System.out.println("isEmpty after some pops : " + a.isEmpty());
    }
}
