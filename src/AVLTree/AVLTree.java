package AVLTree;

import java.util.ArrayList;
import java.util.List;

public class AVLTree implements Leavable {
    public int countOfAddingOperations = 0;
    public int countOfFindingOperations = 0;
    public int countOfDeletingOperations = 0;
    public Node root;


    AVLTree(Node root) {
        this.root = root;
    }

    public Node insert(Node root, int key) {
        if (root.key > key) {
            if (root.left == null) root.left = new Node(key);
            else root.left = insert(root.left, key);
            countOfAddingOperations++;

        } else {
            if (root.right == null) root.right = new Node(key);
            else root.right = insert(root.right, key);
            countOfAddingOperations++;
        }
        countOfAddingOperations++;
        countOfAddingOperations++;
        return rebalanced(root);
    }

    public Node find(Node root, int key) {
        if (root == null || root.key == key) return root;
        countOfFindingOperations++;
        if (root.key > key) return find(root.left, key);
        countOfFindingOperations++;
        return find(root.right, key);
    }

    public Node delete(Node root, int key) {
        if (root == null) return root;
        countOfDeletingOperations++;
        if (key < root.key) {
            countOfDeletingOperations++;
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            countOfDeletingOperations++;
            root.right = delete(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            countOfDeletingOperations++;
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
            countOfDeletingOperations += 2;
        }
        countOfDeletingOperations++;
        return root;
    }

    private int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
            countOfDeletingOperations += 2;
        }
        return minv;
    }

    private Node rebalanced(Node node) {
        updateHeight(node);
        countOfAddingOperations++;
        int balance = height(node.right) - height(node.left);
        if (balance > 1) {
            if (height(node.right.left) > height(node.right.right)){
                node.right = rotateRight(node.right);
                countOfAddingOperations++;
            }
            node = rotateLeft(node);
            countOfAddingOperations++;
        } else if (balance < -1) {
            if (height(node.left.right) > height(node.left.left)){
                node.left = rotateLeft(node.left);
                countOfAddingOperations++;
            }
            node = rotateRight(node);
            countOfAddingOperations++;
        }
        countOfAddingOperations++;
        return node;
    }


    private Node rotateLeft(Node node) {
        Node root = node.right;
        node.right = root.left;
        root.left = node;
        updateHeight(node);
        updateHeight(root);
        countOfAddingOperations += 5;
        return root;
    }

    private Node rotateRight(Node node) {
        Node root = node.left;
        node.left = root.right;
        root.right = node;
        updateHeight(node);
        updateHeight(root);
        countOfAddingOperations += 5;
        return root;
    }


    private int height(Node node) {
        return node == null? -1 : node.height;
    }

    private void updateHeight(Node node) {
        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }
}
