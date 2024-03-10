package queueOnStacks;

public interface queueOnStacksInterface <T> {
    void push (T element);

    T peek ();

    T pop ();

    boolean empty();
}
