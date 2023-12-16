package org.example;

public class LinkedList implements ILinkedList{

    private Node current;

    public LinkedList() {
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
        int r = current.value;
        current = current.next;
        return r;
    }
}
