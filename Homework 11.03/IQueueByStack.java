public interface IQueueByStack<T> {
    public T peek();

    public T pop();

    public void push(T element);

    public boolean isEmpty();
}
