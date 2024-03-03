package hw_queue;

public class Queue<T> {
    private final T[] q;
    private final int n;
    private int c;
    private int top;
    private int end;

    public Queue(int n) {
        this.n=n;
        q = (T[]) new Object[n];
        c=0;
        top=-1;
        end=-1;
    }

    public void push(T elem) throws Exception{

        if (c == n) throw new Exception("queue is full");

        if (c == 0){
            q[c] = elem;
            top = 0;
            end = 0;
        } else {
            end = (++end)%n;
            q[end] = elem;
        }
        c++;
    }



    public T pop() throws Exception {
        if ( isEmpty() ) throw new Exception("queue is empty");

        T x = q[top];
        q[top] = null;
        top = (++top)%n;
        c--;

        if (c == 0) {
            top = -1;
            end = -1;
        }
        return x;
    }

    public boolean isEmpty() {
        return c==0;
    }

    public T peek() {
        return q[top];
    }
}
