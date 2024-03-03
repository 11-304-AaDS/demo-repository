package ru.itis.aisd304.aisddz1;

public class FullQueueException extends Exception{
    public FullQueueException(){
        super("The queue is full");
    }
}
