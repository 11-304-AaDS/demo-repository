package AVLTree;

import java.util.ArrayList;
import java.util.List;

public class AVLTree implements Leavable{
    public static int countOfAddingOperations = 0;
    public static int countOfFindingOperations = 0;
    public static int countOfDeletingOperations = 0;
    public Node root;


    AVLTree(Node root) {
        this.root = root;
    }

    public Node insert(Node root,int key) {
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

    public Node find(int key) {
        Node current = root;
        while (current != null) {
            countOfFindingOperations++;
            if (current.key == key) {
                break;
            }
            current = current.key < key ? current.right : current.left;
        }
        return current;
    }

    public void delete(int key) {
        Node node = find(key);
        countOfDeletingOperations++;
        if (node != null) {
            if (node.left == null & node.right == null) {
                node = null;
            } else {
                Node left = node.right;
                Node prev = left;
                while (left != null) {
                    prev = left;
                    left = left.left;
                    countOfDeletingOperations++;
                }
                node = prev;
                prev = null;
            }
            countOfDeletingOperations++;
        }
        countOfDeletingOperations++;
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
