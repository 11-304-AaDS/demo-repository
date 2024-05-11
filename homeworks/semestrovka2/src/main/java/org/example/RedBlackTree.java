package org.example;

class RedBlackTree {

    private int counter = 0;
    private double time = 0;
    private Node root;
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    private static class Node {
        int key;
        Node left, right;
        boolean color;

        Node(int key) {
            this.key = key;
            this.color = RED;
        }
    }

    // Метод добавления элемента
    public void add(int key) {
        counter = 0;
        double start = System.nanoTime();
        root = add(root, key);
        double end = System.nanoTime();
        time = end-start;
        root.color = BLACK;
    }


    private Node add(Node node, int key) {
        if (node == null) {
            counter++;
            return new Node(key);
        }

        if (key < node.key) {
            node.left = add(node.left, key);
            counter++;
        } else if (key > node.key) {
            node.right = add(node.right, key);
            counter++;
        } else {
            node.key = key;
        }


        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
            counter++;
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
            counter++;
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
            counter++;
        }

        return node;
    }

    // Метод удаления элемента
    public void remove(int key) {
        counter = 0;
        double start = System.nanoTime();
        root = remove(root, key);
        double end = System.nanoTime();
        time = end-start;
    }

    private Node remove(Node node, int key) {
        if (node == null) {
            return null;
        }

        if (key < node.key) {
            node.left = remove(node.left, key);
            counter++;
        } else if (key > node.key) {
            node.right = remove(node.right, key);
            counter++;
        } else {
            if (node.left == null) {
                return node.right;
            }
            if (node.right == null) {
                return node.left;
            }
            Node minNode = findMin(node.right);
            node.key = minNode.key;
            node.right = removeMin(node.right);
        }

        return balance(node);
    }

    public Node getRoot() {
        return root;
    }

    private Node findMin(Node node) {
        if (node.left == null) {
            return node;
        }
        return findMin(node.left);
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = removeMin(node.left);
        return balance(node);
    }

    // Метод поиска элемента
    public boolean search(int key) {
        counter = 0;
        double start = System.nanoTime();
        Node answer = search(root, key);
        double end = System.nanoTime();
        time = end-start;
        return answer != null;
    }

    private Node search(Node node, int key) {
        if (node == null || node.key == key) {
            return node;
        }

        if (key < node.key) {
            counter++;
            return search(node.left, key);
        } else {
            counter++;
            return search(node.right, key);
        }
    }

    private boolean isRed(Node node) {
        if (node == null) {
            return false;
        }
        return node.color == RED;
    }

    private Node rotateLeft(Node node) {
        Node x = node.right;
        node.right = x.left;
        x.left = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

    private Node rotateRight(Node node) {
        Node x = node.left;
        node.left = x.right;
        x.right = node;
        x.color = node.color;
        node.color = RED;
        return x;
    }

    private void flipColors(Node node) {
        node.color = RED;
        node.left.color = BLACK;
        node.right.color = BLACK;
    }

    private Node balance(Node node) {
        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }
        return node;
    }

    public int getCounter() {
        return counter;
    }

    public double getTime() {
        return time;
    }
}