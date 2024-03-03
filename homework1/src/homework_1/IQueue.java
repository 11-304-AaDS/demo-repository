package homework_1;

public interface IQueue {
    public void push(Object e);
    public Object pop() throws NullPointerException;
    public boolean isEmpty();
    public Object peek() throws NullPointerException;
}
