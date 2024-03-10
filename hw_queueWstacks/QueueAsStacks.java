package hw_queueWstacks;

import java.util.Deque;
import java.util.LinkedList;

public class QueueAsStacks<T> {
    private Deque<T> cur;
    private Deque<T> reversed;
    private final int n;
    private int c;

    public QueueAsStacks(int n) {
        this.n = n;
        c=0;
        cur = new LinkedList<>();
        reversed  = new LinkedList<>();
    }

    public void push(T elem) throws Exception {
        if ( c==n ) {
            throw new Exception("queue is full");
        }
        cur.push(elem);
        c++;
    }

    public T pop() throws Exception {
        if ( isEmpty() ) throw new Exception("queue is empty");

        if ( reversed.isEmpty() ) {

            while ( !cur.isEmpty() ) {
                reversed.push(cur.pop());
            }
        }
        c--;
        return reversed.pop();
    }

    public boolean isEmpty() {
        return c==0;
    }

    public T peek() {
        if ( reversed.isEmpty() ) {

            while ( !cur.isEmpty() ) {
                reversed.push(cur.pop());
            }
        }
        return reversed.peek();
    }

}
