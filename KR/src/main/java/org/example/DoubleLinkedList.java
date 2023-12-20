package org.example;

public class DoubleLinkedList implements IStage{

    private Node current;

    public DoubleLinkedList() {
        Node root = new Node(1);
        current = root;
        for (int i = 2; i <= 10; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        current.next = root;
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