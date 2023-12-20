package org.example;

public class DoubleLinkedList implements IStage{

    private Node current;

    public DoubleLinkedList() {
        current = new Node(1);
        for (int i = 2; i <= 10; i++) {

        }
    }

    @Override
    public int next() {
        current = current.next;
        int r = current.value;
        return r;
    }

    @Override
    public int prev() {
        current = current.previous;
        int r = current.value;
        return r;
    }
}