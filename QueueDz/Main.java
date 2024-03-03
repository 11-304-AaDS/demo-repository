package les3.QueueDz;

public class Main {
    public static void main(String[] args) {
        try{
            Queue<Integer> queue = new Queue<>();
            queue.push(4);
            System.out.println(queue.toString());
            queue.push(2);
            System.out.println(queue.toString());
            queue.push(6);
            System.out.println(queue.toString());
            queue.pop();
            System.out.println(queue.toString());
            queue.push(8);
            System.out.println(queue.toString());
            queue.push(5);
            System.out.println(queue.toString());
            queue.pop();
            System.out.println(queue.toString());
            System.out.println();
            System.out.println(queue.peek());

        } catch (EmtyException e) {
            System.err.println(e.getMessage());
        } catch (FullException e) {
            System.err.println(e.getMessage());
        }
    }

}
