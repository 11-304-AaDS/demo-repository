package org.example;

public class QueueOverflowException extends Exception {
    public QueueOverflowException() {
        super("The queue is full");
    }
}
