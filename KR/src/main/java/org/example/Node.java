package org.example;
 public class Node {
        public int value;
        public Node previous;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }
 }
