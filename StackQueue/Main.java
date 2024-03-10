package les4.StackQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue list = new MyQueue();
        list.push(5);
        list.push(2);
        list.push(7);
        list.push(1);
        System.out.println(list.pop());
        System.out.println(list.pop());
        list.push(6);
        System.out.println(list.empty());
        System.out.println(list.peek());
    }
}
