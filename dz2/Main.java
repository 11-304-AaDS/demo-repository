package dz2;

public class Main {
    public static void main(String[] args) {
        Queue2 <Integer> q = new Queue2<>();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);

        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        System.out.println(q.isEmpty());


    }
}
