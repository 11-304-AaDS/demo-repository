import java.util.Stack;

public class QueueByStacks<T> implements IQueueByStack<T> {

    Stack<T> stackInput = new Stack<>();
    Stack<T> stackOutput = new Stack<>();

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else if (stackOutput.isEmpty()) {
            int currentQueueSize = stackInput.size();
            for (int i = 0; i < currentQueueSize; i++) {
                stackOutput.push(stackInput.pop());
            }
        }
        return stackOutput.peek();
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else if (stackOutput.isEmpty()) {
            int currentQueueSize = stackInput.size();
            for (int i = 0; i < currentQueueSize; i++) {
                stackOutput.push(stackInput.pop());
            }
        }
        return stackOutput.pop();
    }

    @Override
    public void push(T element) {
        stackInput.push(element);
    }

    @Override
    public boolean isEmpty() {
        return stackInput.isEmpty() & stackOutput.isEmpty();
    }

    public static void main(String[] args) {
        QueueByStacks<Integer> queue = new QueueByStacks<>();

        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);

        System.out.println(queue.peek());

        System.out.println(queue.pop() + "\n" + queue.pop() + "\n" + queue.pop() + "\n" + queue.pop() + "\n" + queue.pop() + "\n" + queue.pop() + "\n");
        queue.pop();
        queue.peek();

        System.out.println(queue.isEmpty());
    }
}
